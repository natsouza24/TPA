import java.util.Scanner;
public class NumerosPrimos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=10;
		int i, j, a[], r=0;
		a = new int[TAM];
		for(j=0; j<TAM; j++) {
			r = 0;
			System.out.println("Insira o "+(j+1)+"� n�mero inteiro: ");
			a[j] = in.nextInt();
			for(i=1; i<=a[j]; i++) {
				if(a[j] % i == 0) {
					r++;
				}
			}
			if(r > 2) {
				System.out.println("N�o � primo\n");
			}else {
				System.out.println("� primo\n");
			}
		}
		in.close();
	}

}