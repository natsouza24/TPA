import java.util.Scanner;
public class Media {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=10;
		int i, a[], s=0, m;
		a = new int[TAM];
		for(i=0; i<TAM; i++) {
			System.out.println("Insira o "+(i+1)+"° valor: ");
			a[i] = in.nextInt();
			s = s + a[i];
		}
		System.out.print("\nA = [");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]");
		System.out.println();
		m = s/TAM;
		System.out.println("\nA média dos valores é: "+m);
		in.close();
	}

}