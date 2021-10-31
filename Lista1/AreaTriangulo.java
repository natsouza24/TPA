import java.util.Scanner;
public class AreaTriangulo {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		double area, base, h;
		
		System.out.println("Insira a base do triângulo: ");
		
		base = in.nextDouble();
		
		System.out.println("Insira a altura do triângulo: ");
		
		h = in.nextDouble();
		area = (base*h)/2;
		
		System.out.println("O valor da área do triângulo é "+area+" metros");
		
		in.close();
	}

}