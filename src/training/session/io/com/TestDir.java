package training.session.io.com;

import java.io.File;

public class TestDir {
public static void main(String[] args) {
	File f = new File("rutuja1507");
	System.out.println(f.exists());  //first time will get false bacause dir. not available once create dir. return true
	f.mkdir();                       //return true as dir. create
	System.out.println(f.exists());
}
}
