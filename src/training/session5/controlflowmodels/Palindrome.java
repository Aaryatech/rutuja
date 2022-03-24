package training.session5.controlflowmodels;
//task no 15 check no is palindrome or not
/*
logic
num =121
121%10 =1
(0*10)+1=1
121/10=12 
again condition is check
1%10 =1
(0*10)+2=2
12/10 = 1

*/
public class Palindrome {
	    public static boolean isPalindrome(int number)
	    { int reverse =0;
          int lastdigit;//lastdigit is remainder here
          int temp = number; //hold value
	      while(temp>0)
	      {
	       lastdigit = temp%10;
	       reverse = reverse*10+lastdigit;
	       //reverse = reverse+lastdigit;
	         temp = temp/10;
	      }
	       
          if(number==reverse)
	       {	         
        	  System.out.println("no is palindrome"+number);
        	  return true;
           }
	       else
       
	    	   System.out.println("no is not palindrome"+number);
               return false;
	       }
	     
	
	    public static void main(String[] args) {
			System.out.println(isPalindrome(-121));
			System.out.println(isPalindrome(12321));
			System.out.println(isPalindrome(123));
			
			
		}
}
