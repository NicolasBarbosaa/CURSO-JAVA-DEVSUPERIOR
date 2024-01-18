package main;
import java.util.Scanner;

import aplication.Pessoa;

public class main {
	 public static void main(String[] args) {
	        // Lê os dados de altura e gênero de N pessoas.
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        Pessoa[] pessoas = new Pessoa[n];
	        for (int i = 0; i < n; i++) {
	            pessoas[i] = new Pessoa(scanner.nextDouble(), scanner.next());
	        }

	        // Calcula a maior e a menor altura do grupo.
	        double maiorAltura = Double.MIN_VALUE;
	        double menorAltura = Double.MAX_VALUE;
	        for (Pessoa pessoa : pessoas) {
	            maiorAltura = Math.max(maiorAltura, pessoa.altura);
	            menorAltura = Math.min(menorAltura, pessoa.altura);
	        }

	        // Calcula a média de altura das mulheres.
	        double mediaAlturaMulheres = 0;
	        int numMulheres = 0;
	        for (Pessoa pessoa : pessoas) {
	            if (pessoa.genero.equals("F")) {
	                mediaAlturaMulheres += pessoa.altura;
	                numMulheres++;
	            }
	        }
	        mediaAlturaMulheres /= numMulheres;

	        // Calcula o número de homens.
	        int numHomens = 0;
	        for (Pessoa pessoa : pessoas) {
	            if (pessoa.genero.equals("M")) {
	                numHomens++;
	            }
	        }

	        // Escreve a maior e a menor altura do grupo, a média de altura das mulheres, e o número de homens.
	        System.out.println("Maior altura: " + maiorAltura);
	        System.out.println("Menor altura: " + menorAltura);
	        System.out.println("Média de altura das mulheres: " + mediaAlturaMulheres);
	        System.out.println("Número de homens: " + numHomens);
	    }
	}
