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
			System.out.println("\nN�o � tri�ngulo");
		}else if (a==b & b==c){
			System.out.println("\nTri�ngulo Equil�tero");
		    }else if (a!=b & b!=c & a!=c) {
		    	System.out.println("\nTri�ngulo Escaleno");
		        }else {
		        	System.out.println("\nTri�ngulo Is�sceles");
		}
		in.close();
	}

}