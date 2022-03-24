package training.session5.controlflowmodels;
//task 17
public class Evendigitsum {
public static int getEvenDigitSum(int number)
{   int sum =0;
	int i = 1,n;
	while(i<=number)
	{
		n = number%10;
		  
	if(n%2==0)
	  {
		  
          System.out.println("even no is:"+i);
    	 sum += n;
         System.out.println("addition is:"+sum);
       
	   }System.out.println(n);
	n = i/10;
       i++;
       System.out.println(n);
	}
	  
	
 return sum;
}
public static void main(String[] args) {
	//System.out.println(getEvenDigitSum(30));
	System.out.println(getEvenDigitSum(1236));
}
}
