package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable, Task {
	
	ConcurrentLinkedQueue<Task> taskQueue;
	
	public Worker(ConcurrentLinkedQueue<Task> queue) {
		
		taskQueue = queue;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!taskQueue.isEmpty()) {
			System.out.println("something");
			System.out.println(taskQueue);
			//taskQueue.remove();
			//perform();
		}
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		
	}


}
