import java.util.Scanner;
public class Media {
	public static void main(String args[]) {		
		Scanner in = new Scanner(System.in);		
		float nota1, nota2, nota3, media;		
		System.out.println("Insira a primeira nota: ");		
		nota1 = in.nextFloat();		
		System.out.println("Insira a segunda nota: ");		
		nota2 = in.nextFloat();		
		System.out.println("Insira a terceira nota: ");		
		nota3 = in.nextFloat();
		media = (nota1+nota2+nota3)/3;		
		System.out.println("A média das três notas é igual a: "+media);		
		in.close();				
	}

}