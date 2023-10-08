package it.unipv.sfw.multithread;

import java.util.Scanner;

public class ProgramStart {

	public static void main(String[] args) {
		System.out.println("Il programma richiede di Inserire un numero N e calcola: ");
		System.out.println(" - N-esimo numero della serie di Fibonacci;");
		System.out.println(" - il successivo numero primo maggiore di N;");
		System.out.println(" - il numero di divisori di N;");
		System.out.println("Il programma termina quando Viene inserito un numero negativo ");
		
		Scanner input = new Scanner(System.in);
		int N;
		while (true)  {		
			System.out.println("Inserire il numero N (per terminare inserire un numero negativo) :");
			String lettura = input.nextLine();
			try {
				N = Integer.parseInt(lettura);
				if (N < 0) {
					break;
				}
				
				GestoreThreads calcManager = new GestoreThreads(N);
				calcManager.joinThreads();
				
			} catch (NumberFormatException e) {
				System.out.println("ATTENZIONE! è stato inserito un valore non valido, inserire un numero intero");
			}
		}	
	}
}
