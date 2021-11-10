import java.util.Scanner;
public class ConverterEuroDolar {
	public static void main(String args[]) {		
		Scanner in = new Scanner(System.in);		
		double real, cotacaoEuro, cotacaoDolar, euro, dolar;		
		System.out.println("Insira o valor a ser convertido: ");
		real = in.nextDouble();
		System.out.println("Insira a cotação do Euro: ");
		cotacaoEuro = in.nextDouble();
		System.out.println("Insira a cotação do Dólar: ");
		cotacaoDolar = in.nextDouble();
		euro = real/cotacaoEuro;
		dolar = real/cotacaoDolar;
		System.out.printf("O valor de reais inserido (R$"+real+") se converte para: €%.2f euros. %n", (euro));
		System.out.printf("O valor de reais inserido (R$"+real+") se converte para: $%.2f dólares. %n", (dolar));
		in.close();		
	}

}