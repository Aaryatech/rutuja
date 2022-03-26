package training.session6.oopconcepts;
class main1{
	
	 public static void main(String[] args) 
	 {
		

			// TODO Auto-generated constructor stub
			Circle c = new Circle(3.75);
		
			System.out.println("circle radious :"+c.getRadious());
			System.out.println("circle area :" +c.getArea());
			
			Cylinder c1 = new Cylinder(5.55,7.25);
			System.out.println("cylinder radious :"+c1.getRadious());
			System.out.println("cylinder height:" +c1.getHeight());
			System.out.println("cylinder radious: "+c1.getArea());
			System.out.println("cylinder volume:"+c1.getVolume());
		}
	}


