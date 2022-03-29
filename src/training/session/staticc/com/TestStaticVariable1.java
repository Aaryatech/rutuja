package training.session.staticc.com;
//Java Program to demonstrate the use of static variable  
class Student{  
 int rollno;
 String name;  
 static String college ="sanjivani college of engineering kopargaon";//static variable  
 //constructor  
 Student(int r, String n){  
 rollno = r;  
 name = n;  
 }  
 //method to display the values  
 void display ()
 {
	 System.out.println(rollno+" : "+name+" : "+college);
  }  
}  
//Test class to show the values of objects  
public class TestStaticVariable1{  
public static void main(String args[]){  
Student s1 = new Student(150,"Rutuja");  
Student s2 = new Student(151,"Ishwari");  
//we can change the college of all objects by the single line of code  
//Student.college="kthm";  
s1.display();  
s2.display();  
}  
}  