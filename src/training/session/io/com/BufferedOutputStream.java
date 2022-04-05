//package training.session.io.com;
//
//import java.io.*;
//
//public class BufferedOutputStream{    
//public BufferedOutputStream(FileOutputStream fout) {
//		// TODO Auto-generated constructor stub
//	}
//
//public static void main(String args[])throws Exception{    
//     FileOutputStream fout=new FileOutputStream("testout.txt");    
//     BufferedOutputStream bout=new BufferedOutputStream(fout);    
//     String s="Welcome to javaTpoint.";    
//     byte b[]=s.getBytes();    
//     bout.write(b);    
//     bout.flush();    
//     ((FilterOutputStream) bout).close();    
//     fout.close();    
//     System.out.println("success");    
//}
//
//private void write(byte[] b) {
//	// TODO Auto-generated method stub
//	
//}    
//}  