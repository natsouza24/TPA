import java.util.Scanner;
public class ConverterMesesAnos {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int dia, mes, ano;
		System.out.println("Insira o n�mero de dias: ");
		dia = in.nextInt();
		mes = dia/30;
		ano = dia/365;
		System.out.println(dia+" dias convertido para meses � igual a: "+mes+" meses");
		System.out.println(dia+" dias convertido para anos � igual a: "+ano+" anos");
		in.close();
	}

}