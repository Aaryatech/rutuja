package training.session.collections.set.list.com;
//Object class hold multiple types
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Object>obj1 = new ArrayList<Object>();
		obj1.add(1);
        obj1.add(2);
		obj1.add(3);
		obj1.add(4);
		System.out.println("object1 element :"+obj1);
		ArrayList<Object>obj2 = new ArrayList<Object>();
		obj2.add("Rutuja");
		obj2.add("ishu");
		obj2.add("dnyanu");
		obj2.add("shraddha");
		obj2.add(2);
		System.out.println("object2 element: "+obj2);		
		
       	obj1.add(obj2);
		System.out.println("adding list "+obj1);
		
		Collections.copy(obj1, obj2); //copy obj2 to obj1
	System.out.println("copying list :"+obj1);
		
		
		ArrayList<Object>obj3 = new ArrayList<Object>();
		for(Object e:obj1)
		obj3.add(obj2.contains(e));
		System.out.println(obj3);
	}

}



