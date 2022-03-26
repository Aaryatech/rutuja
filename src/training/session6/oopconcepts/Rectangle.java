package training.session6.oopconcepts;

public class Rectangle {
 double width;
 double length;
 double area;
 double height,volume;
 public Rectangle(double width,double length) {
	// TODO Auto-generated constructor stub
	 this.width = width;
	 this.length = length;
	 
}
 double getWidth()
 {
	 return width;
 }
 
 double getLength()
 {
	 return length;
 }
 double getArea()
 {
	 area = width*length;
	 return area;
 }
}
class Cuboid extends Rectangle
{

	public Cuboid(double width, double length,double height) {
		super(width, length);
		// TODO Auto-generated constructor stub
		this.height = height;
	}
	double getHeight()
	{
		return height;
	}
	double getVolume()
	{
		volume = area * height;
		return volume;
	}
}
class main2{
	public static void main(String[] args) {
		Rectangle r = new Rectangle(3,2);
		System.out.println("rectangle width :"+r.getWidth());
		System.out.println("rectangle height :"+r.getLength());
		System.out.println("rectangle area :"+r.getArea());
		Cuboid c = new Cuboid(5, 10, 5);
		System.out.println("cuboid width :"+c.getWidth());
		System.out.println("cuboid length:"+c.getLength());
		System.out.println("cuboid area:"+c.getArea());
		System.out.println("cuboid height :"+c.getHeight());
        System.out.println("cuboid volume:" +c.getVolume());
	} 
}
