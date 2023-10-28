package collections;

import java.util.*;;

public class example {
	public static void main(String[] args) {
		
	
//	System.out.println(10 + 20 + "Javatpoint");   
//    System.out.println("Javatpoint" + 10 + 20);  
		
    
    ArrayList<String> list=new ArrayList<String>();  
    list.add("Ravi");  
    list.add("Vijay");  
    list.add("Ajay");  
      
    HashSet<String> set=new HashSet(list);  
    set.add("Gaurav");  
    Iterator<String> i=set.iterator();  
    while(i.hasNext())  
    {  
    System.out.println(i.next());  
    }  
}  

}
