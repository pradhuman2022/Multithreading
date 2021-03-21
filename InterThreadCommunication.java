// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
    static Stack<Integer> resource1 = new Stack<>();
    static Stack<Integer> resource2 = new Stack<>();
    
	public static void main(String[] args) {
	    resource1.push(1);
	    resource2.push(2);
	    
	    ThreadStack t = new ThreadStack();
	    
		new Thread(){  
            public void run(){
                t.run();
            }
        }.start();
        
        new Thread(){  
            public void run(){
                t.run1();
            }
        }.start();
        
        
	}
}

class ThreadStack {
    Stack<Integer> st = new Stack<>();
    
    synchronized void run() {
        if(st.isEmpty()) {
            try { 
                this.wait();
            }catch(Exception e) {
                
            }
            while(!st.isEmpty())
                System.out.println(st.pop());
        }
     }
     
    synchronized void run1() {
          for (int i = 0; i < 100; i++) {
              st.push(i);
              notify();
          }
     }
}


