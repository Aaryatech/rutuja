package training.session6.oopconcepts;
//86 static and local variable
public class Staticandlocalvarial {
	  static int b = 10; //declare inside or outside fun for static
	public static void funLocal()
	{
	 int a = 10; //always declare inside the method for local 
	 System.out.println("number is a: " +a); //it generate seprate copy 
	 //so it will gives us same value
	 ++a;
	}
	public static void funStatic() 
	{
	 //it generate single copy so value will incremented
	 System.out.println("number is b: " +b); 
	 ++b;
	
	}

 public static void main(String[] args) {
	 funLocal();
	 funLocal();
	 funLocal();
	 funStatic();
	 funStatic();
	 funStatic();
	
}
}
