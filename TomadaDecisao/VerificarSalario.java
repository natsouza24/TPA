import java.util.Scanner;
public class VerificarSalario {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double s, sm;
		System.out.println("Insira o seu salário:");
		s = in.nextDouble();
		System.out.println("Insira o valor do salário mínimo:");
		sm = in.nextDouble();
		if (s < sm) {
			System.out.println("Seu salário de R$"+s+" não é suficiente");
		}else {
			System.out.println("Seu salário de R$"+s+" é suficiente");
		}
		in.close();
	}

}