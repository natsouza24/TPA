import java.util.Scanner;
public class PositivoNegativo {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Insira um n�mero:");
		n = in.nextInt();
		if (n >= 0) {
			System.out.println("O n�mero "+n+" � positivo");
		}else {
			System.out.println("O n�mero "+n+" � negativo");
		}
		in.close();
	}

}