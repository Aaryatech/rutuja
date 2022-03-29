package training.session.collections.com;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
public static void main(String[] args) {
	LinkedList< String>name = new LinkedList<String>();
	name.add("rutuja");
	name.add("ishwari");
	name.add("preeti");
	name.add("shraddha");
	name.add("dnyanu");
	name.addFirst("silvina");
	name.addLast("rutik");
	
	Iterator<String> itr = name.iterator();
    while(itr.hasNext())
    {
    	System.out.println(itr.next());
    }
  
    System.out.println("Traversing the list of elements in reverse order");  
    Iterator i=name.descendingIterator();  
    while(i.hasNext())  
    {  
        System.out.println(i.next());  
    }  
    
    
    
}

}
