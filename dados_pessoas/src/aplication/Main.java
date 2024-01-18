package aplication;

import java.util.Locale;
import java.util.Scanner;

import entites.People;

public class Main {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Quantas pessoas serão digitadas?");
	int n = sc.nextInt();
	People[] vect = new People[n];
	
	for(int i = 0; i < n; i++) {
		System.out.println("Altura da" + i +"a pessoa:");
		double height= sc.nextDouble();
		System.out.println("Genero da" + i +"a pessoa:");
		char genero= sc.next().charAt(0);
		People people = new People(height, genero);
		vect[i] = people;
	}
	int posmaior=0;
	double maiorAltura= Double.MAX_VALUE;
	double menorAltura = Double.MIN_VALUE;
	
	for(People people: vect) {
		maiorAltura = Math.max(maiorAltura, people.getHeight());
		menorAltura = Math.min(menorAltura, people.getHeight());
	}
	System.out.println("result:  "+maiorAltura);
	System.out.println("result 2:  "+ menorAltura);
	
	
	
	
	
	//mostrar os resultados
	System.out.println("VETOR RESULTANTE:");
	
	for(int i=0; i <vect.length; i++) {
		System.out.println(vect[i]);
	}
	
	
	
	
	
	sc.close();
	
	}
}
