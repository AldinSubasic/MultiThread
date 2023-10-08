package it.unipv.sfw.multithread;

public class NextPrimeNumberThread implements Runnable {

	private int number;
	private int nextPrimeNumber;
	
	public NextPrimeNumberThread(int number) {
		if (number < 0) {
			number = 0 ;
		}else {
			this.number = number;
		}
	}

	@Override
	public void run() {
		int temp = number + 1 ;
		while (!isPrime(temp)) { 
			temp++;
		}
		nextPrimeNumber = temp;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println("PROSSIMO PRIMO : " + nextPrimeNumber);
	}
	
	private boolean isPrime(int n) {
		boolean result = true;
		for (int i = 2; i < n; i++) {
			if ( n%i == 0 ) { 
				result = false;
				break;
			}
		}
		return result;
	}
}