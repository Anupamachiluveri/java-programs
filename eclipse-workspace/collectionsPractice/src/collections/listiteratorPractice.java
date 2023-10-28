package collections;

import java.util.*;

public class listiteratorPractice {

	public static void main(String[] args) {
		/*listiterator is used to iterator only list interface
		 */
List<Integer> pincodes= new LinkedList<Integer>();

pincodes.add(505531);
pincodes.add(5984748);
pincodes.add(5874849);
pincodes.add(500073);

ListIterator<Integer> it = pincodes.listIterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
System.out.println();

while(it.hasPrevious()) {
	 System.out.println(it.previous());
}
it.add(5948849);
System.out.println(pincodes);
	}

}
