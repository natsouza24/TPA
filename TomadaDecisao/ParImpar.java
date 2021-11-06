import java.util.Scanner;
public class ParImpar {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n, resto;
		System.out.println("Insira um número inteiro:");
		n = in.nextInt();
		resto = n % 2;
		if (resto == 0) {
			System.out.println("Número par");
		}else {
			System.out.println("Número ímpar");
		}
		in.close();
	}
}