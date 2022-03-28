
package training.oopsconcept.interfase;
//developer never share source file he simply share setup file to client
import java.util.Scanner;

public interface Client {
void input();
void output(); //by default methods are public and abstract
}
class Developer implements Client
{
 int age;
 String name;
	@Override
	public void input() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name: ");
		name = sc.next();
		System.out.println("enter age :");
		age = sc.nextInt();
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		System.out.println("name is:" +name+ " and age is:" +age);
	}
	public static void main(String[] args) 
	 {
	   Client c = new Developer();
	   c.input();
	   c.output();
	 }
}