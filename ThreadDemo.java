public class Executor {
    public static void main(String ar[]) throws InterruptedException
    {
        MyThread1 t = new MyThread1();
        t.start();
        for(int i = 0; i < 10 ; i++)
        {  
            System.out.println("Executor class"+i) ;
        }
    }
}


//------------------Thread Declaration------------------------------
public class MyThread1 extends Thread {
     
     Executor e ;
     public void run()
     {
      for(int i = 0 ; i < 10 ; i++)  // this method should override if ,Multithreading is needed .   
      System.out.println("This is myThread, Dont Dare to touch it") ;   
     }
}
