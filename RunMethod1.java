/*
Overloading of run Method() :- 

Overloading of run method is always possible . Thread class start() can invoke no arg-run()-method .
The Other overloaded method . we have to call explicitly like a normal method. 
*/

class ThreadDemo
{
  public static void main(String arg[])
  {
     MyThread1 t = new MyThread1() ;
     t.start();
     t.run(20) ;
     for(int i = 0; i < 10 ; i++)
     {
      System.out.println("Main Thread") ;
      }
   }
}

public class MyThread1 extends Thread {
     
     Executor e ;
     public void run()
     {
      for(int i = 0 ; i < 10 ; i++)
      System.out.println("This is myThread, Dont Dare to touch it") ;   
     }
     public void run(int k)
     {
      for(int i = 0 ; i < 10 ; i++)
      System.out.println("k") ;   
     }
   
}
