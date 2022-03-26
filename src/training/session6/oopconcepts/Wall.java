package training.session6.oopconcepts;

public class Wall {
	double width,height;

  public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() //calculate method
	{
		return width*height;
	}
Wall() //default constructor
  {
	width =3;
	height =5;
	 
  }
  Wall(int width,int height) //parameterized constructor
{
	this.width = width;
	this.height = height;
}
  Wall(Wall wall)
  {

	  this.width = wall.width; //copy object of another method 
	  this.height = wall. height;

  }
  public static void main(String[] args) {
	Wall w = new Wall();
	System.out.println("default constructor area:"+w.getArea());
	w.setWidth(6);
	w.setHeight(2);
	System.out.println("method through area of the wall: "+w.getArea());
	Wall w1 = new Wall(5,4);
	System.out.println("parameterized area of the wall: "+w1.getArea());
	Wall wall = new Wall();
	System.out.println("copying area is : "+wall.getArea());
}
}
