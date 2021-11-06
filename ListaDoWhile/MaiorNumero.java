import java.util.Scanner;
public class MaiorNumero {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n, m;
		System.out.println("\nDigite um número: ");
		n = in.nextInt();
		m = n;
		do {
			System.out.println("\nDigite o valor: ");
			n = in.nextInt();
			if (n>m) {
				m = n;
			}
		}while (n!=0);
		in.close();
		System.out.println("\nO maior valor é: "+m);
	}

}