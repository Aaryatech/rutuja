package training.session4.method;

public class MinutesToYearsDaysCalculator {
	

 public static void printYearsAndDays(long minutes)
 {
	if(minutes>0)
	{

     long hours = minutes/60;
     long days = hours/24;
     long years = days/365;

     long remainingDays = days % 365;  
     System.out.println("minutes convert into hours,year,days\n:"+hours+"hours\n:"+days+"days\n:"+years+"years\n:"+remainingDays+"remaining_days:");
	}
	else
	{
	System.out.println("invalid value");
	}
 }
	public static void main(String[] args) {
		
		printYearsAndDays(5921112);//minutes converted
	}

}
