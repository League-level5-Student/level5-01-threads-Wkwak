package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {
	int totalThreads; 
	Thread[] Threads;
	
	private ConcurrentLinkedQueue<Task> taskQueue;
	
	public ThreadPool(int i) {
		// TODO Auto-generated constructor stub
		totalThreads = i;
		Threads = new Thread[totalThreads];
		
		for (int j = 0; j < Threads.length; j++) {
			Worker worker = new Worker(taskQueue);
			Threads[j] = new Thread(worker);
		}
		
		taskQueue = new ConcurrentLinkedQueue<Task>();
	}

	public void addTask(Task task) {
		// TODO Auto-generated method stub
		taskQueue.add(task);
	}

	public void start() {
		// TODO Auto-generated method stub
		for (int i = 0; i < Threads.length; i++) {
			Threads[i].start();
			try {
				Threads[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
