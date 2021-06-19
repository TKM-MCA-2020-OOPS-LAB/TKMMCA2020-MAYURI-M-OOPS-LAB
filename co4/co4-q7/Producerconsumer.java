package co4;
import java.util.LinkedList;
public class Producerconsumer {

	public static void main(String[] args) {
		// shared list
		 LinkedList<Integer> list = new LinkedList<Integer>();
		 Thread t1 = new Thread(new Producer(list), "Producer");
		 Thread t2 = new Thread(new Consumer(list), "Consumer");
		 t1.start();
		 t2.start(); 
		}
		}

		//Producer task

		class Producer implements Runnable{
		LinkedList<Integer> list;
		Producer(LinkedList<Integer> list){
		 this.list = list;
		}
		@Override
		public void run() {
		 for(int i = 1; i <=8; i++){
		   synchronized(list) {
		     // If there is already an element in the list wait
		     while(list.size() >= 1){
		       System.out.println("Waiting as queue is full..");
		       try {
		         list.wait();
		       } catch (InterruptedException e) {
		         e.printStackTrace();
		       }
		     }
		     System.out.println("Adding to queue- " + Thread.currentThread().getName() + " " + i);
		     list.add(i);
		     list.notify();    
		   }
		 }		
		}
		}
		//Consumer task
		class Consumer implements Runnable{
		LinkedList<Integer> list;
		Consumer(LinkedList<Integer> list){
		 this.list = list;
		}
		@Override
		public void run() {
		 for(int i = 1; i <= 8; i++){
		   synchronized(list) {
		     // if there is no element in the list wait
		     while(list.size() < 1){
		       System.out.println("Waiting as queue is empty..");
		       try {
		         list.wait();
		       } catch (InterruptedException e) {
		         e.printStackTrace();
		       }
		     }
		     // if there is element in the list then retrieve it
		     System.out.println("Consuming from queue- " + Thread.currentThread().getName() + " " + list.remove());
		     list.notify();  
		   }
		 }		
		


	}

}
