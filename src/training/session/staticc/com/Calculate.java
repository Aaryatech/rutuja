package training.session.staticc.com;
class Calculate{  
	static int cube(int x)
	{
		return x*x*x;
	}
//	  int cube(int x){  //Cannot make a static reference to the non-static method cube(int) from the type Calculate
//	  return x*x*x;  
//	  }  
//	  
	  public static void main(String args[]){  
	  int result=Calculate.cube(5);  
	  System.out.println(result);  
	  }  
	}  