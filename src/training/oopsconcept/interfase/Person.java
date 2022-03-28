package training.oopsconcept.interfase;
//you can not modify properties in interface as they are final
//interface can implement several classes
interface printable{  
void printAge(int age);  
void add(int a,int b);

//void sub(int x,int y); if we delacre method need to implement
}  
class Person implements printable{  
	public void print(){
	System.out.println("Hello");
	}  
  

@Override
public void add(int a, int b) {
	// TODO Auto-generated method stub
	int result = a+b;
	System.out.println("addition is:"+result);
}



@Override
public void printAge(int age) {
	// TODO Auto-generated method stub
	System.out.println("age is"+age);
	
}
public static void main(String args[]){  
Person obj = new Person();  
obj.printAge(12);  
obj.add(3, 2);

 }


}  