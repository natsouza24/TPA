import java.util.Scanner;
public class VolumeLata {
	public static void main(String args[]) {		
		Scanner in = new Scanner(System.in);		
		double r, h, volume;		
		System.out.println("Insira o raio da lata: ");		
		r = in.nextDouble();		
		System.out.println("Insira a altura da lata: ");		
		h = in.nextDouble();
		volume = 3.14*(r*r)*h;		
		System.out.println("O volume da lata é igual a "+volume);		
		in.close();
	}

}