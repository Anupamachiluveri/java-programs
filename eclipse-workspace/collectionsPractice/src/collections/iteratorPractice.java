package collections;
import java.util.Iterator;
import java.util.Stack;
import java.util.Hashtable;
public class iteratorPractice {

	public static void main(String[] args) {

		/*iterator used to iterate the legacy and new classes
		 * has only special method-remove() 
		 */

		Stack<String> books = new Stack<String>();
		books.add("physics");
		books.add("chemistry");
		books.add("biology");
		books.add("maths");

		//	Iterator<String> itr =	books.iterator();
		Iterator itr =	books.iterator();

		while(itr.hasNext()) {
			itr.next();
			itr.remove();
		}
		System.out.println(books);

		Hashtable<String,Integer> book = new Hashtable<>();

		book.put("book1", 1992);
		book.put("book2", 1894);
		book.put("book3", 2001);

		Iterator<String> values =book.keySet().iterator();
		while(values.hasNext()) {
			System.out.println(values.next());
		}


	}

}
