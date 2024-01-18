package main;

import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo retangu = new Retangulo();
				
		System.out.println("Enter rectangle width and height: ");
		System.out.print("Width: ");
		retangu.width = sc.nextDouble();
		System.out.print("Height: ");
		retangu.height = sc.nextDouble();
		
		System.out.printf("Area: %.2f%n", retangu.area());
		System.out.printf("Perimeter: %.2f%n ", retangu.perimeter());
		System.out.printf("Diagonal: %.2f%n", retangu.diagonal());

		sc.close();
	}

}
