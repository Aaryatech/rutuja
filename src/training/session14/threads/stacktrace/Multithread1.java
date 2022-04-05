package training.session14.threads.stacktrace;
//Java code for thread creation by extending
//the Thread class
class MultithreadingDemo1 extends Thread {
	public void run()
	{
		try {
			// Displaying the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId()+ " is running");
		}
		catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}


public class Multithread1 {
	public static void main(String[] args)
	{
		int n = 8; 
		for (int i = 0; i < n; i++) {
			MultithreadingDemo1 object = new MultithreadingDemo1();
			object.start();
			
		}
	}
}
