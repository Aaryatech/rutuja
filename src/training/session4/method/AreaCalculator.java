package training.session4.method;
//import java.lang.Math;
//exercise area_calculator 08
public class AreaCalculator {
	public static double area(double radious)
    { 
        if(radious>0)
        {
        	double PI =3.14;
            double radious_area = PI*radious*radious;
            return radious_area;
            
        }
        return -1;
    }
    public static double area(double x,double y)
    {
       
        double rectangle = x*y;
        return rectangle;
    }
    public static void main(String[] args) {
		System.out.println(area(2));
		System.out.println(area(2, 3));
	}
    
  
}

