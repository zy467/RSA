package MyTask;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyTask implements Runnable {
	private int taskNum;

	public MyTask(int num) {
		this.taskNum = num;
	}

	@Override
	public void run() {
		//SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		System.out.println("开始执行task " + taskNum);
		try {
			Thread.currentThread().sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("task " + taskNum + "执行完毕");// new Date()为获取当前系统时间
	}
}