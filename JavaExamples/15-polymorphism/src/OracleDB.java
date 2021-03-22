
public class OracleDB implements DBConnection {

	@Override
	public void openConnection() {
		System.out.println("Oracle connection open");
	}

	@Override
	public void executeQuery(String query) {
		System.out.println("Oracle query execute");		
	}

	@Override
	public void closeConnection() {
		System.out.println("Oracle connection close");
	}

}
