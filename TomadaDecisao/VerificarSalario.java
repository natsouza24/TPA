import java.util.Scanner;
public class VerificarSalario {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double s, sm;
		System.out.println("Insira o seu sal�rio:");
		s = in.nextDouble();
		System.out.println("Insira o valor do sal�rio m�nimo:");
		sm = in.nextDouble();
		if (s < sm) {
			System.out.println("Seu sal�rio de R$"+s+" n�o � suficiente");
		}else {
			System.out.println("Seu sal�rio de R$"+s+" � suficiente");
		}
		in.close();
	}

}