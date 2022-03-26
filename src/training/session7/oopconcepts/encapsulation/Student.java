package training.session7.oopconcepts.encapsulation;
//task 38 - grouping of data members and functions into the single unit/class is encapsulation.
//if any component follows data hiding and abstraction is encapsulation.
//hiding data behind method is encapsulation.suppose user click on button like bal.enqury he can fetch the data
//but he don't know which method is actually called is abstraction.
//encapsulation = hiding data + abstraction //advantage-security


public class Student{  
	//private data member  
	private String name;  
	//getter method for name  
	public String getName(){  
	return name;  
	}  
	//setter method for name  
	public void setName(String name){  
	this.name=name ; 
	}  
	}  
 
	class Test{  
	public static void main(String[] args){  
	//creating instance of the encapsulated class  
	Student s=new Student();  
	//setting value in the name member  
	s.setName("Rutuja");  
	//getting value of the name member  
	System.out.println(s.getName());  
	}  
	}  