package training.session5.controlflowmodels;

import java.util.Scanner;

public class MInmaxnumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int min =0;
	int max =0;
	while(true)
	{
		System.out.println("enter no:");
		boolean isAnInt = sc.hasNextInt();
		if(isAnInt)
		{
			int num = sc.nextInt();
			if(num>max)
			{
				max = num;
				
			}
			if(num<min)
			{
				min = num;
			}
			
		else
		{
		     break;	
		}
	}
	System.out.println("min no is :"+min+ "max no is: " +max);
}
}
}

