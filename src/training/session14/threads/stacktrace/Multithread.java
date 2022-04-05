package training.session14.threads.stacktrace;

//Java code for thread creation by implementing
//the Runnable Interface

/*If we extend the Thread class, our class cannot extend any other class
 *  because Java doesn’t support multiple inheritance. But, if we implement the Runnable
 *   interface, our class can still extend other base classes.
 */
class MultithreadingDemo implements Runnable {
	public void run()
	{
		try {
			// Displaying the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId()+ " is running");
		}
		catch (Exception e) {
			
			System.out.println("Exception is caught");
		}
	}
}
class Multithread {
	
	public static void main(String[] args)
	{
		int n = 8; // Number of threads
		for (int i = 0; i < n; i++) {
			Thread object = new Thread(new MultithreadingDemo());
			object.start();
			
		}
	}
}
