package training.session14.threads.stacktrace;
/* Multi–Line Stack Trace: This condition occurs when we call the function
  inside into another function and if any function throws Exception 
 retrace all the path where it calls with the printstackTrace() Method.*/

//Arithmathic Exception multiline Stack trace
class MultiLineStackTrace {

	
	static void check2()
	{
		
		try {
		
			int a = 5 / 0;
			// Exception occur as logically
			// In math '/' operatop satisfies x/y where y!=0
		}

	
		catch (Exception e) {
		
			// retrace all the path where this function call
			e.printStackTrace();
		}
	}

	
	static void check() {
		//calling check2() function inside check function
		check2();
		}

	// Driver Main Method
	public static void main(String[] args)
	{
		check(); // calling the function check()
	}
}
