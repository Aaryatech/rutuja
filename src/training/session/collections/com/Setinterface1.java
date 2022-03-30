package training.session.collections.com;
//task on hashset
import java.util.HashSet;
//The objects that we insert into the HashSet do not guarantee to be inserted in the same order. 
//The objects are inserted based on their hashcode. 
import java.util.Set;

public class Setinterface1 {
public static void main(String[] args) {
	

	Set<String> h1 = new HashSet<String>();
	h1.add("rutuja");  //add element in unordered way
	h1.add("ishwari");
	h1.add("preeti");
	h1.add("dnyanu");
	h1.add("shraddha"); //duplicate element is not allowed
	h1.add("preeti");
	

 //Iterator in Java is used to traverse each and every element in the collection.
//	Iterator<String> itr = h1.iterator();
//	while(itr.hasNext())
//	{
//		System.out.println(itr.next());
//	}
	
	
	//It’s commonly used to iterate over an array or a Collections class.(eg, ArrayList)
	  System.out.println("strings data");
	  for(String s:h1)
	  {
		  System.out.println(s);
	  }
	  
	 
	  Set<Integer> h2= new HashSet<Integer>();
	  Set<Integer> h3= new HashSet<Integer>();
	  h2.add(10);
	  h2.add(20);
	  h2.add(30);
	  h2.add(40); //h2 object element will add in h3 
	  System.out.println("h2 element");
	  for(int p:h2)
	  {
		  System.out.println(p);
	  }
	  
	  h3.add(1);
	  h3.add(2);
	  h3.addAll(h2); //only add same type element if we want to add another type then used type casting
     System.out.println("h3 element");
	  for(int i:h3)
	  {
		  System.out.println(i);
	  }
	  
	  System.out.println("contains return true if data available : "+h2.contains(20));
	  System.out.println("return size"+h2.size());
	  System.out.println("return hashcode"+h2.hashCode());
	  System.out.println("return in string format"+h2.toString());
	  System.out.println("remove element"+h2.remove(20));
	  //h2.clear(); clear all the element
	  System.out.println("elements in h2");
      
	  for(int r:h2)
	  {
		  System.out.println(r);
	  }
	}

}
