package Tset;

import Thread.CustomThread;
import Thread.CustomThread1;

public class ThreadTest {
	 public static void main(String[] args) {    
	        String threadName = Thread.currentThread().getName();    
	        System.out.println(threadName + " start.");    
	        CustomThread1 t1 = new CustomThread1();    
	        CustomThread t = new CustomThread(t1);    
	        try {    
	            t1.start();    
	            Thread.sleep(2000);    
	            t.start();    
	            t.join();  
	        } catch (Exception e) {    
	            System.out.println("Exception from main");    
	        }    
	        System.out.println(threadName + " end!");    
	    }    
}
