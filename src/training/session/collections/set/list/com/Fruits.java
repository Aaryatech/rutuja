package training.session.collections.set.list.com;

import java.util.ArrayList;
import java.util.Collections;

public class Fruits {
	public static void main(String[] args) {
		ArrayList<String> f = new ArrayList<>();
		f.add("apple");
		f.add("banana");
		f.add("kivi");
		f.add("lichie");
		
		for(String p:f)
		{
			System.out.println(p);
		}
		
		System.out.println("fruits size"+f.size());
		
		ArrayList<Integer>list  = new ArrayList<>();
	    list.add(10);
	    list.add(20);
	    list.add(40);
	    
	    for(int l:list)
	    {
	    	System.out.println(l);
	    }
	    
	    System.out.println("update value at index 2");
	    list.set(2, 30);
         list.remove(1);
         list.set(1, 12);
         //list.addAll(list);  use this method to add all values
	    for(int l:list)
	    {
	    	System.out.println(l);
	    }
	    System.out.println("total number size"+list.size());
	    Collections.reverse(list);
	    for(int l1:list)
	    {
	    	System.out.println("reverse order"+l1);
	    }
	    }
		   
	}
      

