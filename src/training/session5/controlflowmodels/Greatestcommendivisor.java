package training.session5.controlflowmodels;

public class Greatestcommendivisor {
public static int GCD(int num1,int num2)
{
	if(num1==0)
	{
	   return num2;
	}
	if(num2==0)
	{
		return num1;
	}
	if(num1==num2)
	{
		return num1;
	}
	
	
	if(num1>num2)
	{
		return GCD(num1-num2,num1);
	}
	else
	{
		return GCD(num2, num2-num1);
	}

	
}

public static void main(String[] args) {
	System.out.println(GCD(12, 9));
	System.out.println(GCD(81, 153));
   //System.out.println(a);
}
}
