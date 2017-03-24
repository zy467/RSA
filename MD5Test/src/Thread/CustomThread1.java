package Thread;

public class CustomThread1 extends Thread{
	 public void run() {    
	        String threadName = Thread.currentThread().getName();    
	        System.out.println(threadName + " start.");    
	        try {    
	            for (int i = 0; i < 5; i++) {    
	                System.out.println(threadName + " loop at " + i);    
	                Thread.sleep(5000);    
	            }    
	            System.out.println(threadName + " end.");    
	        } catch (Exception e) {    
	            System.out.println("Exception from " + threadName + ".run");    
	        }    
	    }    
}
