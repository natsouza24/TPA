import java.util.Scanner;
public class ValoresInvertidos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=10;
		int i, j=9, a[], b[];
		a = new int[TAM];
		b = new int[TAM];
		for (i=0; i<TAM; i++) {
			System.out.println("Insira o "+(i+1)+"° valor: ");
			a[i] = in.nextInt();
			b[j] = a[i];
			j--;
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
		in.close();
	}	
		
}