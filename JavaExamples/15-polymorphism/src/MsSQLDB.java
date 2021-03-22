
public class MsSQLDB implements DBConnection {

	@Override
	public void openConnection() {
		System.out.println("MsSQL connection open");		
	}

	@Override
	public void executeQuery(String query) {
		System.out.println("MsSQL query execute");		
	}

	@Override
	public void closeConnection() {
		System.out.println("MsSQL connection close");		
	}

}
