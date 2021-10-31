import java.util.Scanner;
public class SequenciaPA {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int a, r, pa;
		System.out.println("Insira o valor inicial: ");
		a = in.nextInt();
		System.out.println("Insira a razão: ");
		r = in.nextInt();
		for (int i=1; i<=10; i++) {
			pa = a;
			System.out.print(pa+", ");
			a = pa + r;
		}
		in.close();
	}

}