package training.session5.controlflowmodels;
//task 16
public class Firstlastdigitsum {
	
	public static int firstDigit(int n)
	{
	    // Remove last digit from number
	    // till only one digit is left
	    while (n >= 10) //153>=10
	        n /= 10;  //153/10 = 15 condition not satisfied loop repeat
	    //15/10 = 1 condition satisfied and return first digit
	 
	    // return the first digit
	    return n;
	}
	public static int LasttDigit(int n)
	{
	    // Remove last digit from number
	    // till only one digit is left
	    while (n >= 10) 
	    	            //153%10 = 3 condition satisfied 
	    	n %= 10;  
	 
	    // return the first digit
	    return n;
	}
public static int FirstLastDigitSum(int number)
{
	int n = number,sum;
	sum = firstDigit(n)+ LasttDigit(n);
	System.out.println("addition of first digit :"+firstDigit(n)+" and addtion of lastdigit is:"+LasttDigit(n));
	
	return sum;
	
}


public static void main(String[] args) {
	System.out.println(FirstLastDigitSum(768));
    }
}
