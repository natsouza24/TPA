import java.util.Scanner;
public class SerieFibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=0, n, a=1, b=0, c;
		System.out.print("Digite o enésimo termo: ");
		n = in.nextInt();
		do {
			c = a+b;
			a = b;
			b = c;
			System.out.print(c+", ");
			i++;
		}while(i<=n);
		in.close();
	}

}