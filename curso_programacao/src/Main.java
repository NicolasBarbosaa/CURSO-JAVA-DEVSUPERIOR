import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * int hora; System.out.println("Que horas são?"); hora= sc.nextInt();
		 * 
		 * if(hora < 12) { System.out.println("Bom dia"); } else if(hora < 18) {
		 * System.out.println("boa tarde"); } else { System.out.println("Boa noite"); }
		 * int a=2; int b =3; System.out.println(a += b); sc.close();
		 */

		/*
		 * double x=5; double y=0;
		 * 
		 * while (x != y) System.out.print("olha"); System.out.print("olha"); x =
		 * Math.sqrt(y);
		 * 
		 * String original = "abcde FGHIJ ABC abc DEFG "; String s01 =
		 * original.toLowerCase(); String s02 = original.toUpperCase(); String s03 =
		 * original.trim(); String s04 = original.substring(2); String s05 =
		 * original.substring(2, 9); String s06 = original.replace('a', 'x'); String s07
		 * = original.replace("abc", "xy"); int i = original.indexOf("bc"); int j =
		 * original.lastIndexOf("bc"); System.out.println("Original: -" + original +
		 * "-"); System.out.println("toLowerCase: -" + s01 + "-");
		 * System.out.println("toUpperCase: -" + s02 + "-");
		 * System.out.println("trim: -" + s03 + "-");
		 * System.out.println("substring(2): -" + s04 + "-");
		 * System.out.println("substring(2, 9): -" + s05 + "-");
		 * System.out.println("replace('a', 'x'): -" + s06 + "-");
		 * System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		 * System.out.println("Index of 'bc': " + i);
		 * System.out.println("Last index of 'bc': " + j);
		 */

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int sum = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
				System.out.println(sum);
			}
		}
	}
}
