package program;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("What is price the dollar?");
		double price= sc.nextDouble();
		System.out.println(price);
		System.out.println("How many dollars will be bought?");
		double quantites= sc.nextDouble();
		System.out.println(quantites);
		double result= CurrencyConverter.taxa(price, quantites);
		System.out.println(result);
		
		
		
		
		sc.close();
	}

}
