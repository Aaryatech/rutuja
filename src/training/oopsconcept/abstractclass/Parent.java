package training.oopsconcept.abstractclass;

public abstract class Parent {
     
	abstract void draw();
}
	class Child1 extends Parent
	{

		@Override
		void draw() {       //override abstract draw method for circle
			// TODO Auto-generated method stub
			System.out.println("draw a circle");
			
		}
		void printMsg()
		{
			System.out.println("hey Rutuja");
		}
		
	}
	class Child2 extends Parent{

		@Override
		void draw() { //override draw method for rectangle
			// TODO Auto-generated method stub
			System.out.println("draw a rectangle");
			
		}
		
	}
	abstract class Child3 extends Parent{ //when you dont want to implement unimplemented 
		//method then make this class abstract
		void printEvining()
		{
			System.out.println("hey evining");;
		}
		
	}
	class TestMain{
		
	public static void main(String[] args) {
       Parent p = new Child1(); //called child class abstract method by unimplemented parent class object
        p.draw();
        Child1 c = new Child1(); //call normal method by same class object
        c.printMsg();
        Child3 c1 = new Child3() {
		
			@Override
			void draw() { //one unimplemented can use several time
				// TODO Auto-generated method stub
				System.out.println("hello rutuja ");
				
			}
		};
		c1.draw();
		c1.printEvining();
        
	}
	}