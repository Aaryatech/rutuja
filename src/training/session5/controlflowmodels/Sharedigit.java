package training.session5.controlflowmodels;
//task 18
public class Sharedigit {
	public static boolean hasShareDigit(int num1,int num2)
	{
		int lastdigit1 =0;
		int lastdigit2 =0;
		int value = num2;
		
		if((num1>=10 && num1<= 99)&& (num2>=10 && num2<=99))
		{
			while(num1>0)
			{
				lastdigit1 = num1%10;
				System.out.println("no one lastdigit"+lastdigit1);
				
			
			
			do 
			{
				lastdigit2 = num2%10;
				System.out.println("no. two lastdigit"+lastdigit2);
                
				if(lastdigit1 == lastdigit2)
					
				{
					return true;
				}
				else
				{
					num2 = num2/10;
				}
					
			}while(num2>0);
			num2 = value;
			  num1/=10;
			}
	
		
		}
		return false;	
}
	public static void main(String[] args) {
		System.out.println(hasShareDigit(12, 23));
		System.out.println(hasShareDigit(9,99));
		System.out.println(hasShareDigit(15,55));

	}

}
