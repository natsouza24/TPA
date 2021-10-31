import java.util.Scanner;
public class CalcularImposto {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double s, desc, parc, imposto;
		System.out.println("Insira o salário:");
		s = in.nextDouble();
		if (s<=1434.59) {
			desc = 0;
			parc = 0;
			System.out.println("\nIsento");
		}else if (s<=2150.00) {
			desc = 7.5;
			parc = 107.59;
		}else if (s<=2866.70) {
			desc = 15.0;
			parc = 268.84;
		}else if (s<=3582.00) {
			desc = 22.5;
			parc = 483.84;
		}else {
			desc = 27.5;
			parc = 662.94;
		}
		in.close();
		imposto = s/100*desc - parc;
		System.out.printf("\nO imposto devido é R$%.2f",imposto);
	}
}