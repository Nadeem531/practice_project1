package project15_synchronization;
public class Multithread {
	   public void printCount() {
	      try {
	         for(int i = 5; i > 0; i--) {
	            System.out.println("Counter   ---   "  + i );
	         }
	      } catch (Exception e) {
	         System.out.println("Thread  interrupted.");
	      }
	   }
	}

	class ThreadDemo extends Thread {
	   private Thread t;
	   private String threadName;
	   Multithread PD;

	   ThreadDemo( String name,  Multithread pd) {
	      threadName = name;
	      PD = pd;
	   }
	   
	   public void run() {
	      PD.printCount();
	      System.out.println("Thread " +  threadName + " exiting.");
	   }

	   public void start () {
	      System.out.println("Starting " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
	}

	 class TestThread {
	   public static void main(String args[]) {

	      Multithread PD = new Multithread();

	      ThreadDemo T1 = new ThreadDemo( "Thread - 1 ", PD );
	      ThreadDemo T2 = new ThreadDemo( "Thread - 2 ", PD );

	      T1.start();
	      T2.start();

	      // wait for threads to end
	         try {
	         T1.join();
	         T2.join();
	      } catch ( Exception e) {
	         System.out.println("Interrupted");
	      }
	   }
	}
	 