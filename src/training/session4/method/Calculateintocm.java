package training.session4.method;
//58 video
public class Calculateintocm {
	double calcFeetAndInchesToCentimeters(double feet ,double inches)
	{
		if(feet>0|| inches>0 && inches<=12)
		{
			double centimeters = ((feet*30.48)+(inches*2.54));
			//1feet = 30.48
			//1inches= 2.54
			System.out.println("centimeter is:"+centimeters);
		}
		
		return -1;
	}
	double calcFeeAndInchesToCentimeters(double inches)
	{
		if(inches>0)
		{
			double feet =(int)inches/12; //to get in feet divided by 12
	        double remaining_inches = (int)inches%12; //to get remaining inches
	        System.out.println(inches+"inches is equal to" +feet+ "feet and" +remaining_inches+ "inches");
	        double inches_tofeet = (inches/12); // diveded feet by inch 
	        System.out.println(inches_tofeet+ "inches to feet conversion");
	        //return calcFeetAndInchesToCentimeters(feet,inches);
		       
		}
		return -1;
		
		
	}
	public static void main(String[] args) {
		Calculateintocm cm = new Calculateintocm();
		cm.calcFeetAndInchesToCentimeters(5, 5);
		cm.calcFeeAndInchesToCentimeters(36);
		}
	}


