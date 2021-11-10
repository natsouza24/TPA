import java.util.Scanner;
public class CalcularMedia {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double nota1, nota2, media, exame, novaMedia;
		System.out.println("Insira a primeira nota:");
		nota1 = in.nextDouble();
		System.out.println("Insira a segunda nota:");
		nota2 = in.nextDouble();
		media = nota1+nota2/2;
		System.out.println("\nA média é:"+media);
		if (media<3) {
			System.out.println("\nEstá reprovado");
		}else if(media>=6) {
			System.out.println("\nEstá aprovado");
		    }else if(media<6) {
	        	System.out.println("\nEstá em exame");
	        	System.out.println("\nInsira a nota do exame:");
	        	exame = in.nextDouble();
	        	novaMedia = media+exame/2;
	        	System.out.println("\nA nova média é:"+novaMedia);
		        if (novaMedia>=6) {
	        		System.out.println("\nEstá aprovado");
	        	}else {
	        		System.out.println("\nEstá reprovado");
	        	}
		}
		in.close();
	}
	
}