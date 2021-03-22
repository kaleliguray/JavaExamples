
public class MongoDB implements DBConnection{

	@Override
	public void openConnection() {
		System.out.println("Mongo connection open");
	}

	@Override
	public void executeQuery(String query) {
		System.out.println("Mongo execute query");		
	}

	@Override
	public void closeConnection() {
		System.out.println("Mongo connection close");		
	}

}
