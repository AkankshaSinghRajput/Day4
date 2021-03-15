import java.util.ArrayList;
import java.util.Comparator;
//import java.util.Iterator;
import java.util.List;

public class BookList {

	public static void main(String[] args) {
		booklist();
		
	}

	private static void booklist() {
		List<Book> books = new ArrayList<Book>();
		//setting books
		Book book1 = new Book("Learn Java");
		Book book2 = new Book("Teach Java");
		//Book book3 = new Book("Learn Javascript");
		//setting book price
		book1.setPrice(300.0f);
		book2.setPrice(250.0f);
		//book3.setPrice(150.0f);
		//adding books
		books.add(book1);
		books.add(book2);
		//books.add(book3);
		//adding years
		book1.setPublishYear(1990);
		book2.setPublishYear(1890);
		//book3.setPublishYear(2000);
				
		
		books.sort(new Comparator<Book>() {
			public int compare(Book book1, Book book2) {
				return (int)(book1.getPrice()-book2.getPrice());
			}});
		System.out.println(books);
		
		/*Iterator<Book> it=books.iterator();
		while (it.hasNext()) {
			Book book = it.next();
			if(book.getTitle().contains("Learn")) {
			System.out.println(book);
			}
		}
*/		
	}

}