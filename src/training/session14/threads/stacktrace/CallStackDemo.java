package training.session14.threads.stacktrace;
/*Java call stack contains stack frames . Stack frame contains the 
 * information regarding method and its variables(variables local to the method). 
 * A stack frame is added to the call stack when the execution enters the method.
 *  And the stack frame is removed, from the call stack, 
 * for a method, if the execution is done in the method. Consider the below example:
 */


public class CallStackDemo {
  
    public static void main(String[] args) {
        int a=0,b=1;
        new CallStackDemo().method1(b);
        System.out.println("End of main");
    }
  
    public void method1(int b){
        System.out.println("In method1. Value recieved : "+b);
        method2(b);
    }
  
    public void method2(int b){
        System.out.println("In method2. Value recieved : "+b);
        method3();
    }
  
    public void method3(){
        System.out.println("In method3");
    }
}