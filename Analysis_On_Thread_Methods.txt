As In "How to declare Thread using runnable interface" , we define our thread by implementing :

MyRunnable r = new MyRunnable() ;
Thread t1 = new Thread() ; 
Thread t2 = new Thread(r) ;

case 1 : t1.start()
   A new Thread will be created and which is responsible for execution of thread class run method . 
case 2 : t1.run()
  No new Thread wil be created and Thread class run() method will be created, just like normal Method.
case 3 : t2.run()
  A new Thread will not create which is responsible for exection of my runnable run() method . 
case 4 : t2.start()
  A new Thread will be created which is responsible for execution of MyRunnable run() method.
case 5 : r.start()
  we will get compile time error saying MyRunnable class doesn't have start capability .
    Compile Time Error: cannot find Symbol 
    Symbol start() method
    location class MyRunnable
case 6 : r.run()
   No new Thread will be created and a MyRunnable run() thread will be executed like normal method call.
