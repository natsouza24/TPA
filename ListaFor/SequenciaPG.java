import java.util.Scanner;
public class SequenciaPG {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int a, r, pg;
		System.out.println("Insira o valor inicial: ");
		a = in.nextInt();
		System.out.println("Insira a raz�o: ");
		r = in.nextInt();
		for (int i=1; i<=10; i++) {
			pg =a;
			System.out.print(pg+", ");
			a = pg * r;
		}
		in.close();
	}

}