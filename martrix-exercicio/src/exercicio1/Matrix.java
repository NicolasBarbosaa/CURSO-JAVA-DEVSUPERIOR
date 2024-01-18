package exercicio1;

import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("digite o número de linhas");	
	int l = sc.nextInt();
	System.out.println("digite o número de Colunas");	
	int c= sc.nextInt();
	int[][] mat = new int[l][c];
	
	for (int i=0; i<mat.length; i++) {
		for (int j=0; j<mat[i].length; j++) {
			mat[i][j] = sc.nextInt();
		}
	}
	System.out.println();
	System.out.println("Digite o número que você quer as informações:");
	int x = sc.nextInt();
	
	System.out.println("--------------------------");
	 // Imprimir a matriz
	 for (int i = 0; i < mat.length; i++) {
         for (int j = 0; j < mat[i].length; j++) {
             System.out.print(mat[i][j] + " ");
         }
         System.out.println(); // Pular para a próxima linha após cada linha da matriz
     }
	
	 for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
	
	
	
	
	sc.close();
	}

	@Override
	public String toString() {
		return "Matrix []";
	}

}
