package training.session.collection.queuee.com;

import java.util.*;

public class QueueToArray {
   public static void main(String[] args) {
		
	Queue<String> queue = new LinkedList<>();
	queue.add("one");
	queue.add("two");
	queue.add("three");
	queue.add("four");
	queue.add("five");
		
	String strArray[] = queue.toArray(new String[queue.size()]);
	System.out.println(Arrays.toString(strArray)); 
	
	 }
}
