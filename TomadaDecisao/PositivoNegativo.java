import java.util.Scanner;
public class PositivoNegativo {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Insira um número:");
		n = in.nextInt();
		if (n >= 0) {
			System.out.println("O número "+n+" é positivo");
		}else {
			System.out.println("O número "+n+" é negativo");
		}
		in.close();
	}

}