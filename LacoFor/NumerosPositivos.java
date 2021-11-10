import java.util.Scanner;
public class NumerosPositivos {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int i, q, n, pa=0, im=0, s=0, sp=0, mp, m;
		System.out.println("Insira a quantidade de números: ");
		q = in.nextInt();
		for (i=1; i<=q; i++) {
			System.out.println("Insira o número: ");
			n = in.nextInt();
			s = s+n;
			if (n % 2 == 0) {
				pa++;
				sp = sp+pa;
			}else {
				im++;
			}
		}
		in.close();
		System.out.println("\nQuantidade de números pares: "+pa);
		System.out.println("\nQuantidade de números ímpares: "+im);
		mp = sp/pa;
		System.out.println("\nA média de números pares: "+mp);
		m = s/q;
		System.out.println("\nA média geral dos números: "+m);
	}

}