import java.util.Scanner;
public class CalcularGastoCombust {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double km, l, medio;
		System.out.println("Insira a distãncia percorrida em quilômetros:");
		km = in.nextDouble();
		System.out.println("Insira a capacidade do tanque de combustível em litros:");
		l = in.nextDouble();
		medio = km/l;
		System.out.println("\nO gasto médio de combustível é "+medio);
	    if (medio>=10) {
	    	System.out.println("\nO seu carro é econômico");
	    }else {
	    	System.out.println("\nO seu carro não é econômico");
	    }
	    in.close();
	}

}