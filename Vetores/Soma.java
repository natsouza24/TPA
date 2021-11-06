import java.util.Scanner;
public class Soma {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=10;
		int i, a[], b[], c=0;
		a = new int[TAM];
		b = new int[TAM];
		for(i=0; i<TAM; i++) {
			System.out.println("Insira o "+(i+1)+"° valor de A: ");
			a[i] = in.nextInt();
		}
		System.out.println();
		for(i=0; i<TAM; i++) {
			System.out.println("Insira o "+(i+1)+"° valor de B: ");
			b[i] = in.nextInt();
			c = c + a[i] + b[i];
		}
		System.out.print("\nA = [");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]");
		System.out.println();
		System.out.print("\nB = [");
		for(i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
		System.out.println();
		System.out.println("\nC = "+c);
		in.close();
	}

}