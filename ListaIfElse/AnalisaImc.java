import java.util.Scanner;
public class AnalisaImc {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double peso, altura, imc;
		System.out.println("Insira o seu peso:");
		peso = in.nextDouble();
		System.out.println("Insira a sua altura:");
		altura = in.nextDouble();
		imc = peso/(altura*altura);
		System.out.println("\nO seu IMC é "+imc);
		if (imc<18.5) {
			System.out.println("\nExcesso de Magreza");
		}else if (imc<=25) {
			System.out.println("\nPeso Normal");
            }else if (imc<=30) {
            	System.out.println("\nExcesso de Peso");
                }else if (imc<=35) {
                	System.out.println("\nObesidade (Grau I)");
                    }else if (imc<=40) {
                    	System.out.println("\nObesidade (Grau II)");
                        }else {
                        	System.out.println("\nObesidade (Grau III)");            
		}
		in.close();
	}
}