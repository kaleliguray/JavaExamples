
public interface DBConnection {

	public abstract void openConnection();

	void executeQuery(String query);

	void closeConnection();

}
