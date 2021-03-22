package com.yjs3408.hr.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yjs3408.hr.repo.domain.Department;

public class DepartmentRepo extends AbstractRepo<Department> {

	public boolean save(Department entity) {
		boolean success = false;
		try (Connection connection = openConnection()) {
			final String sqlCmd = "INSERT INTO departments (department_name) VALUES (?)";
			try (PreparedStatement statement = connection.prepareStatement(sqlCmd, Statement.RETURN_GENERATED_KEYS)) {
				statement.setString(1, entity.getName());
				success = statement.executeUpdate() > 0;
				if (success) {
					try (ResultSet resultSet = statement.getGeneratedKeys()) {
						if (resultSet.next()) entity.setId(resultSet.getLong(1));
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return success;
	}

	public void saveAll(List<Department> entities) {
		try (Connection connection = openConnection()) {
			final String sqlCmd = "INSERT INTO departments (department_name) VALUES (?)";
			for (Department entity : entities) {
				try (PreparedStatement statement = connection.prepareStatement(sqlCmd,
						Statement.RETURN_GENERATED_KEYS)) {
					statement.setString(1, entity.getName());
					if (statement.executeUpdate() > 0) {
						try (ResultSet resultSet = statement.getGeneratedKeys()) {
							if (resultSet.next()) entity.setId(resultSet.getLong(1));
						}
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean update(Department entity) {
		boolean success = false;
		try (Connection connection = openConnection()) {
			final String sqlCmd = "UPDATE departments SET department_name=? WHERE department_id=?";
			try (PreparedStatement statement = connection.prepareStatement(sqlCmd)) {
				statement.setString(1, entity.getName());
				statement.setLong(2, entity.getId());
				success = statement.executeUpdate() > 0;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return success;
	}

	public boolean delete(long id) {
		boolean success = false;
		try (Connection connection = openConnection()) {
			final String sqlCmd = "DELETE FROM departments WHERE department_id=?";
			try (PreparedStatement statement = connection.prepareStatement(sqlCmd)) {
				statement.setLong(1, id);
				success = statement.executeUpdate() > 0;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return success;
	}

	public Department findById(long id) {
		Department entity = null;
		try (Connection connection = openConnection()) {
			final String sqlCmd = "SELECT * FROM departments WHERE department_id=?";
			try (PreparedStatement statement = connection.prepareStatement(sqlCmd)) {
				statement.setLong(1, id);
				try (ResultSet resultSet = statement.executeQuery()) {
					if (resultSet.next()) {
						entity = new Department();
						entity.setId(resultSet.getLong("department_id"));
						entity.setName(resultSet.getString("department_name"));
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return entity;
	}

	public List<Department> findAll() {
		List<Department> entities = new ArrayList<Department>();
		try (Connection connection = openConnection()) {
			final String sqlCmd = "SELECT * FROM departments";
			try (Statement statement = connection.createStatement()) {
				try (ResultSet resultSet = statement.executeQuery(sqlCmd)) {
					while (resultSet.next()) {
						Department entity = new Department();
						entity.setId(resultSet.getLong("department_id"));
						entity.setName(resultSet.getString("department_name"));
						entities.add(entity);
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return entities;
	}

	@Override
	public long count() {
		long count = 0;
		try (Connection connection = openConnection()) {
			final String sqlCmd = "SELECT COUNT(*) FROM departments";
			try (Statement statement = connection.createStatement()) {
				try (ResultSet resultSet = statement.executeQuery(sqlCmd)) {
					resultSet.next();
					count = resultSet.getLong(1);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

}
