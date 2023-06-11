package comparatorlms;

import java.util.Comparator;
import getsetlms.Books;

public class BookComparator implements Comparator<Books> {
	public int compare(Books b1, Books b2) {
		return b1.getBookTitle().compareTo(b2.getBookTitle());
	}
}
