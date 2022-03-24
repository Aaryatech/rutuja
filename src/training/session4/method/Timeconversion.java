package training.session4.method;
//video no 60
public class Timeconversion {
 private static String getDurationString(long minutes,long seconds)
{
	
	if(minutes>0 || seconds>0 || seconds <=59)
	{
		long hours = minutes/60;
		long remaining_minutes = minutes%  60;
		return hours+ "h" +remaining_minutes+ "m" +seconds+ "s";
	}
	
	return "invalid value";
	
}
private  static  String getDurationString(long seconds)

{
	if(seconds>0)
	{
	long minutes = seconds /60;
	long remaining_seconds = seconds%60;
	return getDurationString(minutes,remaining_seconds);
}
	return "invalid value";
}

public static void main(String[] args) {
	System.out.println("minute and seconds as input:"+getDurationString(78, 45));
	System.out.println("seconds as input:"+getDurationString(13343));
}
}
