import java.util.Scanner;
public class Fatorial {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int a, f=1;
		System.out.println("Insira o valor: ");
		a = in.nextInt();
		for (int i=1; i<=a; i++) {
			f = f*i;
		}
		in.close();
		System.out.println("O fatorial de "+a+"! é: "+f);
	}

}