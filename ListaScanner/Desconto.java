import java.util.Scanner;
public class Desconto {
	public static void main(String args[]) {		
		Scanner in = new Scanner(System.in);		
		float produto, desconto, valorDesc, valorFinal;		
		System.out.println("Insira o preço de um produto: ");		
		produto = in.nextFloat();		
		System.out.println("Insira uma porcentagem de desconto: ");		
		desconto = in.nextFloat();
		valorDesc = (desconto*produto)/100;
		valorFinal = produto-valorDesc;		
		System.out.printf("O valor do produto com o desconto aplicado será: R$%.2f",+valorFinal);		
		in.close();
	}

}