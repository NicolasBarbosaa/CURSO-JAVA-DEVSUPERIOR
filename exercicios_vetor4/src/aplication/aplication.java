package aplication;

import java.util.Locale;
import java.util.Scanner;

public class aplication {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeros, qntDePares;
		
	
		System.out.print("Quantos números serão digitados? ");
		numeros = sc.nextInt();
		
		int[] vetor = new int[numeros];
		int[] numeroPar = new int [numeros];
		
		for(int i= 0; i < numeros; i++) {
			System.out.print("Digite um número ");
			vetor[i]= sc.nextInt();
			
			}
			
			System.out.println("\nNUMEROS PARES:");
			
			
			qntDePares=0;
			
			for(int i=0; i< numeros; i++) {
				if(vetor[i]% 2 == 0) {
					System.out.printf("%d ", vetor[i]);
				qntDePares++;
			}	
		}
		    System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qntDePares);
		

		
		sc.close();
	}
}
