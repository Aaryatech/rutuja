package training.session5.controlflowmodels;

import java.util.Scanner;

//72 reading input from user
public class Readinput {
public static void main(String[] args) {
	String name = " ";
	String sirname = "";
	int age,yearofbirth = 0;
	String city;
	String place;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter  your name");
	name = sc.nextLine();
	System.out.println("enter sirname");
	sirname = sc.nextLine();
	System.out.println("enter year of birth");
	//age = sc.nextInt();
    yearofbirth = sc.nextInt(); //taking input as year of birth
	age = 2022 -yearofbirth;

	if(age>0 && age <=100) {
   System.out.println("name is:  "+name+"  " +sirname+ " and her current age is:"+age);
	}
	else
	{
		System.out.println(+age+ ": is invalid age");
	}
   System.out.println("enter your city");
	city =sc.next();;
	System.out.println("enter fav. place");
    place = sc.next();
    System.out.println("city is:"+city+  " and fav. place is :"+place);

	
}
}
