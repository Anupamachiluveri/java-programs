package collections;
import java.util.*;
public class practice1 {

	public static void main(String[] args) {
		List<Integer> ll = new ArrayList<Integer>();
		
		ll.add(4);
		ll.add(5);
		ll.add(0);
		ll.add(0);
		ll.add(9);
		ll.add(8);
		ll.add(10);
		
		int sum =0;
		 for(int i=0; i<ll.size();i++) {
			 if(ll.get(i)%2==0) {
				 sum+=ll.get(i);
				 System.out.println(sum);
			 }
//			 sum+=ll.get(i);
//			 System.out.println(sum);
//			 System.out.println(sum/ll.size());
			 
		 }
		
	}

}
