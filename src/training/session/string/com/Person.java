package training.session.string.com;
//string comparison using equals method and == operator
public class Person {
	public static void main(String args[])
	{

	String s1 = "Rutuja";
	String s2 = "Rutuja";
	String s3 = new String("Rutuja");
	String s4 = new String("Rutuja");
	
	System.out.println("using equals method");
	System.out.println(s1.equals(s2)); //return true becoz content is same
	//System.out.println(s2.equals(s4));
	System.out.println(s1.equals(s3)); //return true content is same
	System.out.println(s1.equals(s4));  //return true content is same
	System.out.println(s3.equals(s4));  //return true
 
	System.out.println("using == comparision operator");
	System.out.println(s1==s2);  
	System.out.println(s1==s3); //return false as they check reference of string also check content and case
	System.out.println(s3==s4); //return false as object having different physical address
	
}
}