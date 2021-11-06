import java.util.Scanner;
public class Idade {
	public static void main(String args[]) {		
		Scanner in = new Scanner(System.in);		
		int anoNasc, anoAtual, idade;		
		System.out.println("Insira a data de nascimento: ");		
		anoNasc = in.nextInt();		
		System.out.println("Insira o ano atual: ");		
		anoAtual = in.nextInt();
		idade = anoAtual - anoNasc;		
		System.out.println("A sua idade é "+idade+" anos");		
		in.close();				
	}

}