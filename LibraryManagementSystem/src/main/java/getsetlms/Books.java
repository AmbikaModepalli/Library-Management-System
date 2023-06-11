package getsetlms;

public class Books {

	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private String bookCategory;

	public Books(int bookId, String bookTitle, String bookAuthor, String bookCategory) {
		// super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookCategory = bookCategory;
	}

	public Books() {
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}

	@Override
	public String toString() {
		return "BookID=" + bookId + ", BookTitle=" + bookTitle + ", BookAuthor=" + bookAuthor + ", BookCategory="
				+ bookCategory;
	}
}