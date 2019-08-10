/* 
We can define a Thread by implementing runnable interface . 
                           Runnable (I)
                          /        \
                        Thread(C)  MyRunnable(C) 
                        /
                       MyThread(C) 
                       
Runnable(I) present in java.lang package and it contains only run() Method . 
*/

class MyRunnable implements Runnable 
{
   public void run()
   {
     for(int i = 10; i >= 0 ; i--)
     System.out.println("This is Child Thread") ;
   }
}

class ThreadDemo
{
  public static void main(String arg[]) 
  {
    MyRunnable r = new MyRunnable() ; 
    Thread t1 = new Thread(t) ;
    t1.start();
    for(int i = 0 ; i <= 10 ; i++)
     System.out.println("Main Thread :") ; 
  } 
}  
/* 
It also contain mixed output as before .
*/
