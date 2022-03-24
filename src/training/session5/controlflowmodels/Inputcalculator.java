package training.session5.controlflowmodels;

import java.util.Scanner;

//task 27
public class Inputcalculator {
public static boolean printSumAndAverage()
{
	int sum=0;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter how much no do u want to add");
	int number = sc.nextInt();
	System.out.println("addition of this no");
	for(int i=1;i<number;i++)
	{
		sum = sc.nextInt();
		sum +=number;
		System.out.println("addition is: "+sum);
	}
//	for(int i =1;i<number;i++)
//	{
////		boolean isAnInt = sc.hasNextInt();
////		while(isAnInt)
////		{
//		System.out.println("enter number");	
//             sum+=number;
//		    
//			System.out.println("sum of numbers: "+sum);
//		//}
//		
//	}
	return false;
	}
  public static void main(String[] args) {
	 System.out.println(printSumAndAverage());
}
}
