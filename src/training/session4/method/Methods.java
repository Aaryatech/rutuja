package training.session4.method;

public class Methods {
	int x,y,z;
	void add()
	{
		int a=2,b=5;
		int c = a+b;
		System.out.println(c);
		
	}
	void add(int x,int y)
	{
		this.x = x;
		this.y = y;
		z = x+y;
		System.out.println("addition is:"+z);
		
	}
	int sub()
	{
		int a=8,b=3;
		int c;
		c = a-b;
		//System.out.println(c);
	
		return c;
	}
	int sub(int x,int y)
	{
		this.x = x;
		this.y = y;
	    z = x+y;
	    return z;
	}
	public static void main(String[] args) {
		Methods m = new Methods();
		m.add(); //no argument no return type
		m.add(2,3); //argument with no return type
		System.out.println("substaction is:"+m.sub());//no argument with return type
		System.out.println("substraction is with argumemt:"+m.sub(11, 5));
	}
}
