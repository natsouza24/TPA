import java.util.Scanner;
public class NumerosPositivos {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int i, q, n, pa=0, im=0, s=0, sp=0, mp, m;
		System.out.println("Insira a quantidade de n�meros: ");
		q = in.nextInt();
		for (i=1; i<=q; i++) {
			System.out.println("Insira o n�mero: ");
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
		System.out.println("\nQuantidade de n�meros pares: "+pa);
		System.out.println("\nQuantidade de n�meros �mpares: "+im);
		mp = sp/pa;
		System.out.println("\nA m�dia de n�meros pares: "+mp);
		m = s/q;
		System.out.println("\nA m�dia geral dos n�meros: "+m);
	}

}