import java.util.Scanner;
public class ConverterMesesAnos {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int dia, mes, ano;
		System.out.println("Insira o número de dias: ");
		dia = in.nextInt();
		mes = dia/30;
		ano = dia/365;
		System.out.println(dia+" dias convertido para meses é igual a: "+mes+" meses");
		System.out.println(dia+" dias convertido para anos é igual a: "+ano+" anos");
		in.close();
	}

}