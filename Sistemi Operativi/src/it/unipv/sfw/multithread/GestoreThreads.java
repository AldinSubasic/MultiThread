package it.unipv.sfw.multithread;

import java.util.ArrayList;
import java.util.List;

public class GestoreThreads {

	private List<Thread> threads;
	private FibonacciThread fibonacciRun;
	private NextPrimeNumberThread primeRun;
	private DivisorsCounterThread divCountRun;
	
	public GestoreThreads(int N) {
		fibonacciRun = new FibonacciThread(N);
		primeRun = new NextPrimeNumberThread(N);
		divCountRun = new DivisorsCounterThread(N);
		startThreads();		
	}
	
	private void startThreads() {
		threads = new ArrayList<>();
		threads.add(new Thread(fibonacciRun));
		threads.add(new Thread(primeRun));
		threads.add(new Thread(divCountRun));
		for(Thread t : threads) {
			t.start();
		}
	}
	
	public void joinThreads() {
		for(Thread t : threads) {
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
	

