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
		System.out.println("\nA m�dia �:"+media);
		if (media<3) {
			System.out.println("\nEst� reprovado");
		}else if(media>=6) {
			System.out.println("\nEst� aprovado");
		    }else if(media<6) {
	        	System.out.println("\nEst� em exame");
	        	System.out.println("\nInsira a nota do exame:");
	        	exame = in.nextDouble();
	        	novaMedia = media+exame/2;
	        	System.out.println("\nA nova m�dia �:"+novaMedia);
		        if (novaMedia>=6) {
	        		System.out.println("\nEst� aprovado");
	        	}else {
	        		System.out.println("\nEst� reprovado");
	        	}
		}
		in.close();
	}
	
}