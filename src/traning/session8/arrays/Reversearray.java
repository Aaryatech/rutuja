package traning.session8.arrays;

import java.util.Scanner;

//task 43
public class Reversearray {
public static void main(String[] args) {
int arr[] = new int[10];
int size = 0;
Scanner sc = new Scanner(System.in);
System.out.println("enter size of array");
 size = sc.nextInt();  //taking input size from user
System.out.println("enter array elemnent"); 
for(int i=0;i<size;i++)
{
  arr[i]= sc.nextInt();  //array elements are taking from user
}
System.out.println("elements are");
for(int i=0;i<size;i++)
{
	System.out.println(arr[i]); //print element
}
System.out.println("elments are reverse");
for(int i=size-1;i>=0;i--) //i= 5-1;i>=0;i--  loop will work in decrement order
{
	System.out.println(arr[i]);
}
}
}
