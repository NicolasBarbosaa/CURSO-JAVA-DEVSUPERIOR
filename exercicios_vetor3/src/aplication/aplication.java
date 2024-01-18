package aplication;

import java.util.Locale;
import java.util.Scanner;

public class aplication {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int pessoas, pessoasMenores;
		double alturaMedia,percentualMenores,alturaTotal;
		pessoasMenores = 0;
		alturaMedia=0.0;
		alturaTotal=0.0;
		percentualMenores=0.0;
	
		
		
		System.out.print("Quantas pessoas serao digitadas? ");
		pessoas = sc.nextInt();
		
		int[] idade = new int[pessoas];
		String[] nome = new String[pessoas];
		double[] altura = new double [ pessoas];
		
		for(int i= 0; i < pessoas; i++) {
			System.out.printf("Dados da %d a pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nome[i]= sc.next();
			System.out.print("Idade: ");
			idade[i]= sc.nextInt();
			System.out.print("Altura: ");
			altura[i]= sc.nextDouble();
			
		}
		
		
		for(int i =0; i< pessoas; i++) {
			if(idade[i] < 16) {
				pessoasMenores++;
			}
			alturaTotal += altura[i];
		}
		
		alturaMedia= alturaTotal/pessoas;
		percentualMenores=((double)pessoasMenores/pessoas)*100;
		
		
		System.out.printf("\nAltura media = %.2f\n", alturaMedia);
		System.out.println();
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

		
		sc.close();
	}
}
