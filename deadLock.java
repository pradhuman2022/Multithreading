// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
    static Stack<Integer> resource1 = new Stack<>();
    static Stack<Integer> resource2 = new Stack<>();
    
	public static void main(String[] args) {
	    resource1.push(1);
	    resource2.push(2);
	    
		ThreadStack t1 = new ThreadStack(resource1, resource2);
		
		ThreadStack t2 = new ThreadStack(resource2, resource1);
		
		t1.start();
		t2.start();

		System.out.println(t1.isAlive()+ " " +  t1);
		System.out.println(t2.isAlive() + " " + t2);
		
	}
}

class ThreadStack extends Thread {
    Stack<Integer> st1;
    Stack<Integer> st2;
    public ThreadStack(Stack<Integer> st1, Stack<Integer> st2) {
        this.st1 = st1;
        this.st2 = st2;
    }
    
    @Override
    public void run() {
            synchronized(st1) {
                System.out.println("locked" + st1.peek() + " " + st1.hashCode());
                
            try { 
                this.sleep(100);
            }
            catch(Exception e) {
                System.out.println("Intrepput thread");
            }
                
            synchronized(st2) {
                System.out.println("locked" + st2.peek() + " " + st2.hashCode());
            }
        }
    }
}


