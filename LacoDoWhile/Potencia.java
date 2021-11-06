import java.util.Scanner;
public class Potencia {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int i=0, p=1, b, e;
		System.out.println("Insira uma base: ");
		b = in.nextInt();
		System.out.println("Insira um expoente: ");
		e = in.nextInt();
		do {
			p = p*b;
			i++;
		}while(i!=e);
		in.close();
		System.out.println("A potência de "+b+"^"+e+" é: "+p);
	}

}