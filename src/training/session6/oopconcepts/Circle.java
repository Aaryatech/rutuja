package training.session6.oopconcepts;

public class Circle {
private static final double PI = 3.14;
double radious;
double height;
double area;
Circle(double radious)
{
	if(radious<0)
	{
		radious =0;
	}
	else
	{
		this.radious=radious;
		System.out.println(+radious);
	}
}
public double getRadious()
{
	return radious;
	
}
public double getArea()
{
     area =(radious*radious*PI);
	return area;
}

}
class Cylinder extends Circle
{
   
	Cylinder(double radious,double height) {
		super(radious);
		// TODO Auto-generated constructor stub
		if(height<0)
		{
			height =0;
		}
		else
		{
			this.radious = radious;
			this.height = radious;
		}
	}
	public double getHeight()
	{
		return height;
		
	}
	public double getVolume()
	{
		 double volume = height*area;
		 return volume;
	}
}

