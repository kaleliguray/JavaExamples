import java.util.Date;

public class Document {

	private static final int AUTHOR_LENGTH = 2;

	private final String[] authors = new String[AUTHOR_LENGTH];
	private Date date = new Date();

	private int authorIndex = 0;

	public String[] getAuthors() {
		return authors;
	}

	public Date getDate() {
		return date;
	}

	public void addAuthor(String author) {
		authors[authorIndex++] = author;
		if (authorIndex == AUTHOR_LENGTH) {
			authorIndex = 0;
		}
	}

}
