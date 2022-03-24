package training.session6.oopconcepts;
//task 29 sum calculator
public class Sumcalculator {
	double first_num;
	double sec_num;
	double result;
	public double getFirstNumber()
	{     
		return first_num;
	}
	public double setFirstNumber(double first_num)
	{
		return this.first_num = first_num;
		}
	public double geSecondaNumber()
	{
		return sec_num;
		
	}
	public double setSecondNumber(double sec_num)
	{
		return this.sec_num = sec_num;
		
	}
	public double getAddition()
	{
		result = first_num +sec_num;
		return result;
		
	}
	public double getSubtraction()
	{
		result = first_num -sec_num;
		return result;
		
	}
	public double getMultiplication()
	{
		result = first_num *sec_num;
		return result;
		
	}
	public double getDivision()
	{
		result = first_num /sec_num;
		return result;
		
	}
	public static void main(String[] args) {
		
		 Sumcalculator sumcal = new Sumcalculator();
		 //sumcal.geSecondaNumber();
		 sumcal.setFirstNumber(2.0);
		 sumcal.setSecondNumber(4.0);
		 System.out.println("addition is :"+sumcal.getAddition());
		 System.out.println(sumcal.getSubtraction());
		 System.out.println(sumcal.getMultiplication());
		 System.out.println(sumcal.getDivision());
		
		}
	

}
