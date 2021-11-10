import java.util.Scanner;
public class Bhaskara {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double a, b, c, delta, raizDelta, x1, x2;
		System.out.println("Insira o valor de A:");
		a = in.nextDouble();
		System.out.println("Insira o valor de B:");
		b = in.nextDouble();
		System.out.println("Insira o valor de C:");
		c = in.nextDouble();
		delta = (b*b) - 4*a*c;
		if (delta<0) {
			System.out.println("\nNão existem raízes reais para a equação");
		}else if (delta==0) {
			x1 = (-b) / (2*a);
			System.out.println("\nx1 = "+x1);
			System.out.println("\nExiste apenas uma raiz real para a equação");
		}else {
			raizDelta = Math.sqrt(delta);
			x1 = (-b + raizDelta) / (2*a);
			x2 = (-b - raizDelta) / (2*a);
			System.out.println("\nx1 = "+x1);
			System.out.println("\nx2 = "+x2);
			System.out.println("\nExistem duas raízes reais para a equação");
		}
		in.close();
	}

}