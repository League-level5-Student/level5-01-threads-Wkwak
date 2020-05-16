package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable, Task {

	private ConcurrentLinkedQueue<Task> taskQueue;

	public Worker(ConcurrentLinkedQueue<Task> queue) {

		this.taskQueue = queue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (!taskQueue.isEmpty()) {
			Task task = taskQueue.remove();
			task.perform();
			
		}
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub

	}

}
