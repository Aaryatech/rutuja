package training.session.collections.set.list.com;
//duplicates value not allowed
//elements are store in ordered way and its a case sensitive a and  A both are different
import java.util.Set;
import java.util.TreeSet;

class Treeset1 {
public static void main(String[] args)
 {
     // Creating a Set interface with reference to
     // TreeSet
     Set<String> ts1 = new TreeSet<>();

     // Elements are added using add() method
     ts1.add("C");
     ts1.add("B");
     ts1.add("A");
    // ts1.add(1);  use generic concept for that

     // Duplicates will not get insert
     ts1.add("C");
     ts1.add("a");
     ts1.add("b");
     ((TreeSet<String>) ts1).pollFirst(); //remove first element
     ((TreeSet<String>) ts1).pollLast(); // remove last element
     // Elements get stored in default natural
     // Sorting Order(Ascending)
     System.out.println(ts1);
     System.out.println(ts1.contains("C")); //return boolean true or false
     System.out.println(ts1.toString()); //traversing data
    // System.out.println(ts1.toArray());
     
 }  
}