package com.yjs3408.hr.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.yjs3408.hr.repo.domain.GenericEntity;

public abstract class AbstractRepo<E extends GenericEntity> implements GenericRepo<E> {

	
	public Connection openConnection() throws SQLException {
		return DriverManager.getConnection(DBConfig.DB_URL, DBConfig.DB_USERNAME, DBConfig.DB_PASSWORD);
	}
	
}
