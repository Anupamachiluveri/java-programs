package collections;
import java.util.*;
public class Fruits {

	public static void main(String[] args) {
		
		Deque<String> ad = new ArrayDeque<String>();
		
	     ad.add("kiwi");
	     
	     ad.offer("apple");
	     
	     ad.addFirst("grapes");
	     
	     ad.addLast("papaya");
	     
	     ad.offerFirst("orange");
	     
	     ad.offerLast("mango");
     
	     
	     System.out.println(ad);
	     
	     System.out.println(ad.peek());
	     
	     System.out.println(ad.peekFirst());
	     
	     System.out.println(ad.peekLast());
	     
		System.out.println(ad.poll());
		
		System.out.println(ad.pollFirst());
		
		System.out.println(ad.pollLast());
		
		System.out.println(ad);

		
		
	}

}
