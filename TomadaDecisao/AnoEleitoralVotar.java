import java.util.Scanner;
public class AnoEleitoralVotar {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int anoNasc, anoEleitoral, idade;
		System.out.println("Insira seu ano de nascimento:");
		anoNasc = in.nextInt();
		System.out.println("Insira o ano eleitoral:");
		anoEleitoral = in.nextInt();
		idade = anoEleitoral-anoNasc;
		System.out.println("Sua idade �: "+idade);
		if (idade > 16) {
			System.out.println("\nPoder� votar");
		}else {
			System.out.println("\nN�o poder� votar");
		}
		in.close();
	}

}