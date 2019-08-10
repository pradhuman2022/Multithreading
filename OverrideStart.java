/*
  If We Override start() then our start() will be executed like normal method call ,a new thread will not be created .
 */
 
 class MyThread extends Thread
 {
   public void start()
   {
    System.out.println("Normal Overridden Start Method") ;
   }
   
   public void run()
   {
    System.out.println("It won't be executed in this demo as we overridden start method") ;
   }
 }
 
 class ThreadDemo  // Main Thread
{
   public static void main(String ar[])
   {
    MyThread t = new MyThread() ;
    t.start() ;
    System.out.println("Main Thread is Stronger as Usual") ; 
    }
}
