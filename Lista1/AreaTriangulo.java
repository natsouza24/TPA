import java.util.Scanner;
public class AreaTriangulo {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		double area, base, h;
		
		System.out.println("Insira a base do tri�ngulo: ");
		
		base = in.nextDouble();
		
		System.out.println("Insira a altura do tri�ngulo: ");
		
		h = in.nextDouble();
		area = (base*h)/2;
		
		System.out.println("O valor da �rea do tri�ngulo � "+area+" metros");
		
		in.close();
	}

}