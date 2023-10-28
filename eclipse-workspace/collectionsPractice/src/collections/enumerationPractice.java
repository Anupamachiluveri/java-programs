package collections;
import java.util.*;
public class enumerationPractice {

	public static void main(String[] args) {
		
		/* enemuration is the interface  
		 * used to iterate the legacy  collection classes 
		 */
		
		
		Vector cities = new Vector();
		
		 cities .add("hyderabad");
		 cities .add("karimnagar");
		 cities .add("nalgonda");
		 cities .add("siddipet");
		 
		 System.out.println( cities );
		
		 Enumeration<String> es =  cities .elements();
		 
		 while(es.hasMoreElements()) {
			 System.out.println(es.nextElement());
			 
		 }
		 
		 Hashtable<String,Integer> country = new Hashtable<>();
		 
		 country.put("india",1947);
		 country.put("myanmar", 1948);
		 country.put("brazil", 1822);
		 
		Enumeration< Integer> values= country.elements();
		
		while(values.hasMoreElements()) {
			System.out.println(values.nextElement());
			
			
		}
		
	}

}
