package training.session5.controlflowmodels;
//sumoddrange 14

public class Sumoddrange {

 public static boolean isOdd(int number) {
     return number % 2 == 1;
}
public static int sumOdd(int start,int end)
{
	int add = 0,val;
	for(val = start;val <=end;val++)
	{
		if(val%2!=0&&val>0)
		{
			add += val;
			System.out.println("odd no"+val);
			
			
		}
		else
		{
			return -1;
		}
	
		
	}
	System.out.println("addition is:"+add);
	return val;

	}
public static void main(String args[])
{
	System.out.println(isOdd(9)); // return true
	System.out.println(isOdd(10)); //return false
	System.out.println(sumOdd(1, 100));//addition of odd numbers
	System.out.println(sumOdd(-1,100));//addition of negative numbers
	System.out.println(sumOdd(13,13));//addition of negative numbers
}

}