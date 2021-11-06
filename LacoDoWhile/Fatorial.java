import java.util.Scanner;
public class Fatorial {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int i=1, f=1, n;
		System.out.println("Digite um número inteiro: ");
		n = in.nextInt();
		do {
			f = f*i;
			i++;
		}while(i<=n);
		in.close();
		System.out.println("O fatorial de "+n+"! é: "+f);
	}

}