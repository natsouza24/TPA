import java.util.Scanner;
public class CalcularGastoCombust {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double km, l, medio;
		System.out.println("Insira a dist�ncia percorrida em quil�metros:");
		km = in.nextDouble();
		System.out.println("Insira a capacidade do tanque de combust�vel em litros:");
		l = in.nextDouble();
		medio = km/l;
		System.out.println("\nO gasto m�dio de combust�vel � "+medio);
	    if (medio>=10) {
	    	System.out.println("\nO seu carro � econ�mico");
	    }else {
	    	System.out.println("\nO seu carro n�o � econ�mico");
	    }
	    in.close();
	}

}