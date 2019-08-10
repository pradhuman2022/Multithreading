/*
 If we are not overriding run() , then method class run() method will be executed which has empty implementation .
 Hence we won't get any output. 
 */
 
 class MyThread extends Thread
 {
 }
 
 class ThreadDemo
 {
  public static void main(String ar[])
  {
    MyThread t = new Thread() ; 
    t.start() ;
    System.out.println("Main Thread won") ;
  }
 }
