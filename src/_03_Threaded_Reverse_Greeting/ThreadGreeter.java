package _03_Threaded_Reverse_Greeting;

public class ThreadGreeter implements Runnable{

	int threadNumber; 
	
	public ThreadGreeter(int value) {
		threadNumber = value;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello from thread number: " + threadNumber);
		if (threadNumber < 50) {
			// Pass in a new object of the ThreadedGreeter class with the value of the member variable plus one.
			ThreadGreeter tg = new ThreadGreeter(threadNumber + 1);
			Thread g = new Thread(tg);
			//4. Start the thread and then use the join() method to make the parent thread wait for this thread to finish.
			g.start();
			try {
				g.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
