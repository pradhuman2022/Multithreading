// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
	public static void main(String[] args) {
	  ProducerConsumerResource producerConsumerResource = new ProducerConsumerResource(10);
	  new Thread() {
	      @Override
	      public void run() {
	          producerConsumerResource.produce();
	      }
	  }.start();
	  
	  new Thread() {
	      @Override
	      public void run() {
	          producerConsumerResource.consume();
	      }
	  }.start();
	}
}

class ProducerConsumerResource {
    int array[];
    int size;
    int currentSize;
    int tail;
    int head;
    
    Random random = new Random();
    
    ProducerConsumerResource(int size) {
        this.size = size;
        array = new int[size];
        this.tail = 0;
        this.head = 0;
        this.currentSize = 0;
    }
    
    synchronized void produce()  {
        while(true) {
            try {
                if(currentSize == size)
                    wait();
            } catch(Exception e){}
            array[tail] = random.nextInt();
            tail = (tail + 1) % size;
            currentSize++;
            notify();
        }
    }
    
    synchronized void consume() {
        while(true) {
            try{
                if(currentSize <= 0)
                    wait();
            } catch(Exception e) {}
            System.out.println("consuming  " + array[head]+ " head " + head);
            head = (head + 1) % size;
            currentSize--;
            notify();
        }
    }
}


