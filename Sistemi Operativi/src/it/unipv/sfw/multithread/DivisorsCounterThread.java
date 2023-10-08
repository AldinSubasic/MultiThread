package it.unipv.sfw.multithread;

public class DivisorsCounterThread implements Runnable {

	private int number;
	private int divisorsNumber;
	
	public DivisorsCounterThread(int number) {
		divisorsNumber = 0;
		if (number < 0) {
			number = 0 ;
		}else {
			this.number = number;
		}
	}

	@Override
	public void run() {
		for (int i = 1; i <= number; i++) {
			if (number%i == 0) {
				divisorsNumber++;
			}
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		System.out.println("NUMERO DI DIVISORI: "+ divisorsNumber);
	} 
}