import java.util.Scanner;
public class Triangulos {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double a, b, c;
		System.out.println("Insira o valor de A:");
		a = in.nextDouble();
		System.out.println("Insira o valor de B:");
		b = in.nextDouble();
		System.out.println("Insira o valor de C:");
		c = in.nextDouble();
		if (a>b+c | b>a+c | c>a+b) {
			System.out.println("\nNão é triângulo");
		}else if (a==b & b==c){
			System.out.println("\nTriângulo Equilátero");
		    }else if (a!=b & b!=c & a!=c) {
		    	System.out.println("\nTriângulo Escaleno");
		        }else {
		        	System.out.println("\nTriângulo Isósceles");
		}
		in.close();
	}

}