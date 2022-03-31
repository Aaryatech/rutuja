package training.session.collections.map;
// Note: It prints the elements in same order
// as they were inserted


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Linkedhashmap {
public static void main(String[] args) {
	LinkedHashMap<Integer,String> emp = new LinkedHashMap<Integer, String>();
    emp.put(25,"rutuja");
    emp.put(21,"ishwari");
    emp.put(22,"silvina");
    emp.put(23,"anuja");
    emp.put(24,"anuja");
 
    
  
    
    
    
    System.out.println(emp);
    System.out.println(emp.equals("rutuja"));
    System.out.println("return hashcode :"+emp.hashCode());
    System.out.println("size of emp : "+emp.size());
    System.out.println("replace value : "+emp.replace(24,"anuja","tanuja"));
    System.out.println("is empty : "+emp.isEmpty());
    
    
    
    
    
    LinkedHashMap<Integer,String> emp1 = new LinkedHashMap<Integer, String>();
    emp1.put(2,"rohini");
    emp1.put(1,"mohini");
    emp1.put(3,"tanuja");
    emp1.put(4,"vijaya");
    emp1.put(6,"sakshi");
    System.out.println("next dictionary : "+emp1);

    System.out.println("is contain key : "+emp1.containsKey(24));
    System.out.println("is contain value : "+emp1.containsValue("rutuja"));
    
    
    System.out.println("add dictionary");
   
    
    
    
}
	
	
}
