package training.session14.threads.stacktrace;
//arrayindexoutofboudsexception occured
class SingleLineStackTrace {

	
	public static void main(String[] args)
	{
		// Inserting elements into array
		int a[] = { 1, 2, 3};

		// Try-Catch Block
		try {
			// Exception occurs
			System.out.println(a[5]);
		}

		// Try-Catch Block
		catch (ArrayIndexOutOfBoundsException e) {

			// Printing Exception Object as well as
			// the line where Exception occur
			e.printStackTrace();
		}
	}
}
