package training.session.collections.map;
import java.util.Map;
import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {
	
	public static void main(String[] args) {
		
		  Map<String, Integer> marks = new HashMap<>();
		
		marks.put("rutuja",100);
		marks.put("rohini",200);
		marks.put("rohit",300);
		marks.put("krishna",400);
		marks.put("mohini",600);
		marks.put("sakshi", 100);
		Hashtable<String,Integer>marks1 = new Hashtable<String, Integer>(marks);
		
		System.out.println(""+marks1);
	
	}

}

