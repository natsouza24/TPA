import java.util.Scanner;
public class Intervalos {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int q, n, c1=0, c2=0, c3=0, c4=0;
		System.out.println("Insira a quantidade de números: ");
		q = in.nextInt();
		for (int i=1; i<=q; i++) {
			System.out.println("Insira o número: ");
			n = in.nextInt();
			if (n>=0 & n<=25) {
				c1++;
			}else if (n>=26 & n<=50) {
				c2++;
			}else if (n>=51 & n<=75) {
				c3++;
			}else if (n>=76 & n<=100) {
				c4++;
			}
		}
		in.close();
		System.out.println("\nQuantidade de números do intervalo de 0 a 25: "+c1);
		System.out.println("\nQuantidade de números do intervalo de 26 a 50: "+c2);
		System.out.println("\nQuantidade de números do intervalo de 51 a 75: "+c3);
		System.out.println("\nQuantidade de números do intervalo de 76 a 100: "+c4);
	}

}

