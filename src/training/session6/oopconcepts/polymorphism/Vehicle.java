package training.session6.oopconcepts.polymorphism;
// method overriding
class Vehicle{  
  void run(){
	  System.out.print("Vehicle is running");
	  }  
}  
  
class Bike extends Vehicle{  
  public static void main(String args[]){  
  //creating an instance of child class  
  Bike obj = new Bike();  
  
  obj.run();  //call base class method via child class instance
  }  
}  
