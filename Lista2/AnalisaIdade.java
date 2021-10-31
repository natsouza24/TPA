import java.util.Scanner;
public class AnalisaIdade {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int anoNasc, anoAtual, idade;
		System.out.println("Insira o seu ano de nascimento:");
		anoNasc = in.nextInt();
		System.out.println("Insira o ano atual:");
		anoAtual = in.nextInt();
		idade = anoAtual-anoNasc;
		System.out.println("\nA sua idade é "+idade+" anos");
		if (idade < 10) {
			System.out.println("\nCriança");
		}else if (idade < 18) {
			System.out.println("\nAdolescente");
		    }else if (idade < 60) {
		    	System.out.println("\nAdulto");
		        }else {
		        	System.out.println("\nIdoso");
		}
		in.close();
	}
}