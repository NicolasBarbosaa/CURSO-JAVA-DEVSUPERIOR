package aplication;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números serão colocados em cada vetor?");
		int n = sc.nextInt() ;

		int [] vetorA = new int[n];
		int [] vetorB = new int [n];
		
		
		System.out.println("Escreva os valores do primeiro vetor");
		
		
		for(int i=0; i< vetorA.length; i++) {
			System.out.println("digite o número da posição: " + i);
			vetorA[i] = sc.nextInt();
			
		

	}
		System.out.println("Escreva os valores do segundo vetor");
		
		
		for(int i=0; i< vetorB.length; i++) {
			System.out.println("digite o número da posição: " + i);
			vetorB[i] = sc.nextInt();
			

		}
		 
		int [] vetorR = new int [n];
		for(int i =0; i < n; i++) {
			vetorR[i] = vetorA[i] + vetorB[i];
		}
		
		
		
		
		//para ver os valores do vetor A e B
		for(int i=0; i <vetorA.length; i++) {
			System.out.println(vetorA[i]);
		}
		
		for(int i=0; i <vetorB.length; i++) {
			System.out.println(vetorB[i]);
		}
		System.out.println("VETOR RESULTANTE:");
		for(int i=0; i <vetorR.length; i++) {
			System.out.println(vetorR[i]);
		}
		
		
		
		
		sc.close();
	}
	}
