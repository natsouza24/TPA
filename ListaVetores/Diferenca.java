import java.util.Scanner;
public class Diferenca {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=10;
		int i, j=0, k=0, a[], b[], c[];
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		boolean encont;
		for(i=0; i<TAM; i++) {
			System.out.println("Insira o "+(i+1)+"� n�mero do vetor A: ");
			a[i] = in.nextInt();
		}
		System.out.println();
		for(i=0; i<TAM; i++) {
			System.out.println("Insira o "+(i+1)+"� n�mero do vetor B: ");
			b[i] = in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			encont = false;
			for(j=0; j<TAM; j++) {
				if(a[i] == b[j]) {
					encont = true;
				}
			}
			if(encont == false) {
				c[k] = a[i];
				k++;
			}
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
		System.out.print("\nC = [");
		for(i=0; i<TAM; i++) {
			System.out.print(c[i]+" ");
		}
		System.out.print("]");
		in.close();
	}

}