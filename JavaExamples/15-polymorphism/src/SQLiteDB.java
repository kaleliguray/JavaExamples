
public class SQLiteDB implements DBConnection{

	@Override
	public void openConnection() {
		System.out.println("SQLite connection open");
	}

	@Override
	public void executeQuery(String query) {
		System.out.println("SQLite execute query");
	}

	@Override
	public void closeConnection() {
		System.out.println("SQLite connection close");		
	}

}
