import java.util.Scanner;
public class ConversorKm {
	public static void main(String args[]) {		
		Scanner in = new Scanner(System.in);		
		double metro, km;		
		System.out.println("Insira um valor em metros a ser convertido: ");		
		metro = in.nextDouble();
		km = metro/1000;		
		System.out.println("O valor inserido ("+metro+" metros) se converte para: "+km+" quilômetros");		
		in.close();
	}

}