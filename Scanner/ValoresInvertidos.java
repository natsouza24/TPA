import java.util.Scanner;
public class ValoresInvertidos {
	public static void main(String args[]) {		
		Scanner in = new Scanner(System.in);		
		int a, b, c;		
		System.out.println("Insira o valor de A: ");		
		a = in.nextInt();		
		System.out.println("\nInsira o valor de B: ");		
		b = in.nextInt();
		c = a;
		a = b;
		b = c;		
		System.out.println("\nValor de A: "+a);
		System.out.println("\nValor de B: "+b);		
		in.close();
	}

}