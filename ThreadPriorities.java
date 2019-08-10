/*
 Every thread in java has some priority , It may be default priority generated by JVM , or customize priority generated by Programmer. 
 The valid range of Thread Priorities is 1 to 10 , where 1 is min priority abd 10 is max priority.
 
 Thread class define following constants to represent some standard priorties :-
 1- Thread.MIN_PRIORITY -> 1 
 2- Thread.MAX-PRIORITY -> 10 
 3- Thread.NORM_PRIORITY -> 5 
 
Thread Scheduler will use priorities while allocating processor , the thread which is having highesht priority will get done first.
If two threads have same priority , we cann't expect the order of output .
Some Platforms don't provide the proper support for Thread Priority . 

There are following two methods for thread priority :-

1- public final int getPriority() 
2- public final int setPriority(int p)

Default Priority -: 
The Default Priority only for main Thread is 5 , but for all remaining Threads , default priority will be inherited from Parent to Child 
That is whatever priority parent has , some priority will be for child Thread .
*/

class MyThread extends Thread
{
}

class ThreadPriorities
{
  public static void main(String ar[])
  {
    System.out.println("Thread.currentThread().getPriorirty()") ;
    Thread.currentThread().setPriority(7) ;
    MyThread t = new MyThread() ;
    System.out.printltn(t.getPriority()) ;
   }
 }
 //if we comment line 33 then child Thread Priority will be 5 . 
