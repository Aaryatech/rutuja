package traning.session8.arrays;

public class Arrayprog {
public static void main(String[] args) {
	int x[]; //array declaration
	x = new int[3]; //array creation
	x[0]= 2; // array intialization
	x[1]= 3;
	x[2]= 4;
	System.out.println(+x[0]+ " "+x[1]+ " "+x[2]);
	
	int y[] = {10,20,30,40}; //declaration creation and intialization in single ra
	System.out.println(y[3]); //return only 40 because 40 at position 3
	int z[][] = {{10,20},{30,40,50}}; //multiidimention translation
	System.out.println(z[0][1]+" :" +z[1][1]);
	}
	}

