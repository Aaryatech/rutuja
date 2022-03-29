package training.session.generics.com;
class TestGenerics<T1,T2>{ 
	
	
	
public void display(T1 var1,T2 var2)
{
	System.out.println("id is "+var1+ " and " +var2+" is name of the student");
}

public static void main(String args[]){  
	TestGenerics<Integer,String> obj = new TestGenerics<Integer,String>();
   obj.display(1,"Rutuja");
  // obj.display("Rutuja",1);
}  
}  
