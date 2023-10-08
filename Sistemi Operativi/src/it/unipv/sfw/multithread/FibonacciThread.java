package it.unipv.sfw.multithread;

public class FibonacciThread implements Runnable {

	private int index;
	private long nFib;
	
	public FibonacciThread(int index) {
		if (index < 0) {
			this.index = 0;
		} else {
			this.index = index;
		}
		this.nFib = 0;
	}

	@Override
	public void run() {
		if ( index == 0) 
			nFib = 0;
		else {
			long nextFib = 1;	  
			long prevFib= 0;	  
			for(int i = 1; i < index; i++) {
				long temp = nextFib;
				nextFib += prevFib;
				prevFib = temp;
			}
			nFib = nextFib;	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		System.out.println("FIBONACCI : " + nFib);
	}
}