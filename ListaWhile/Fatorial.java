import java.util.Scanner;
public class Fatorial {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int i=1, n, f=1;
		System.out.println("Digite um número inteiro: ");
		n = in.nextInt();
		while (i<=n) {
			f = f*i;
			i++;
		}
		in.close();
		System.out.println("O fatorial de "+n+"! é: "+f);
	}

}