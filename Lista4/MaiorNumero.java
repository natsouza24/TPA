import java.util.Scanner;
public class MaiorNumero {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int i=0, n, m=0, v;
		System.out.println("\nInsira um número: ");
		n = in.nextInt();
		do {
			i++;
			System.out.println("\nInsira o valor: ");
			v = in.nextInt();
			if (n>m) {
				m = n;
				System.out.println("\nO maior valor é: "+m);
			}
		}while (v!=n);
		in.close();
	}

}
