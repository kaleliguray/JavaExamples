import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Driver {

	// 1. Encapsulation
	// 2. Inheritance
	// 3. Polymorphism
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		
		Constructor constructor = Employee.class.getDeclaredConstructors()[0];
		constructor.setAccessible(true);
		Employee employee = (Employee) constructor.newInstance(null);
		employee.setFirstName("Bora");
		System.out.println(employee.getFirstName());
		
//		Employee employee = new Employee();
//		System.out.println(employee.getFirstName());
//		
//		
//		
//		Field field = Employee.class.getDeclaredField("firstName");
//		field.setAccessible(true);
//		field.set(employee, "Bora");
//		
//		System.out.println(employee.getFirstName());
		
		
		
		

//		DBConnection connection = (DBConnection) Class.forName(args[0]).newInstance();
//		connection.openConnection();
//		connection.executeQuery("query");
//		connection.closeConnection();

//		DBConnection dbConnection = null;
//		switch (args[0].toLowerCase()) {
//		case "oracle":
//			dbConnection = new OracleDB();
//			break;
//		case "mysql":
//			dbConnection = new MySQLDB();
//			break;
//		case "mssql":
//			dbConnection = new MsSQLDB();
//			break;
//		case "mongo":
//			dbConnection = new MongoDB();
//			break;
//		default:
//			dbConnection = new MySQLDB();
//			break;
//		}
//
//		dbConnection.openConnection();
//		dbConnection.executeQuery("SELDECT * FROM asdasdasd");
//		dbConnection.closeConnection();

//		MySQLDB mySQLDB = new MySQLDB();
//		mySQLDB.openConnection();
//		mySQLDB.executeQuery("SELECT * FROM employees");
//		mySQLDB.closeConnection();

//		OracleDB oracleDB = new OracleDB();
//		oracleDB.openConnection();
//		oracleDB.executeQuery("SELECT * FROM employees");
//		oracleDB.closeConnection();

//		DBConnection[] connections = {
//				new OracleDB(),
//				new MySQLDB(),
//				new MsSQLDB()
//		};
//		
//		for (int i = 0; i < connections.length; i++) {
//			connections[i].openConnection();
//			connections[i].executeQuery("SELECT * FROM employees");
//			connections[i].closeConnection();
//		}

//		DBConnection dbConnection = new OracleDB();
//		dbConnection.openConnection();
//		dbConnection.executeQuery("SELECT * FROM employees");
//		dbConnection.closeConnection();

//		DBConnection dbConnection2 = new MySQLDB();
//		dbConnection2.openConnection();
//		dbConnection2.executeQuery("SELECT * FROM employees");
//		dbConnection2.closeConnection();
//		
//		DBConnection dbConnection3 = new MsSQLDB();
//		dbConnection3.openConnection();
//		dbConnection3.executeQuery("SELECT * FROM employees");
//		dbConnection3.closeConnection();

//		Object object = (Object)new Integer(1);
//		object = "Selam";
//		object = 3.14;
//
//		System.out.println(object);

//		Integer integer = null;

//		Object object = false;// new Boolean(false);

	}

}
