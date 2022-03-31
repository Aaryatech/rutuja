package training.session.collections.map;
import java.util.HashMap;


public class Hashmapexample{

	
	public static void main(String[] args)
	{
		
		HashMap<String, Integer> map = new HashMap<>();

		
		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);
		map.put("rutuja",10);

	
		System.out.println("Size of map is:- "
						+ map.size());

	
		System.out.println(map);

		// Checking if a key is present and if
		// present, print value by passing
		// random element
		if (map.containsKey("vishal")) {

			// Mapping
			Integer a = map.get("vishal");

			// Printing value fr the corresponding key
			System.out.println("value for key"
							+ " \"vishal\" is:- " +a);
		}
	}
}
