import java.util.Scanner;
public class Palindromos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=10;
		int i, j, a[];
		a = new int[TAM];
		boolean encont;
		for(i=0; i<TAM; i++) {
			System.out.println("Insira o "+(i+1)+"� elemento do vetor A: ");
			a[i] = in.nextInt();
		}
		i = 0;
		j = TAM-1;
		encont = true;
		while ((i < j) & (encont == true)) {
		    if (a[i] != a[j]) {
		       encont = false;
		    }else {
		      i++;
		      j--;
		    }
		}
		System.out.print("\nA = [");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i]);
		}
		System.out.print("]");
		System.out.println();
		if(encont == true) {
			System.out.println("\nOs elementos do vetor A formam um pal�ndromo");
		}else {
			System.out.println("\nOs elementos do vetor A n�o formam um pal�ndromo");
		}
		in.close();
	}
	
}