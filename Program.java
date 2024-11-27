package application;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		double media = 0;
		
		
		int n = sc.nextInt();
		Double[] vect = new Double[n];
		
		for(int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		System.out.print("VALORES =");
		
		for(int i=0; i<n; i++) {
			System.out.printf(" %.1f ", vect[i] );
			
		}
		System.out.println("");
		
		for(int i=0; i<n; i++) {
			soma = soma + vect[i];
		}
		
		System.out.printf("SOMA = %.2f%n", soma );
		
		media = soma / n; 
		
		System.out.printf("MEDIA = %.2f", media );
		
		sc.close();
	}

}
