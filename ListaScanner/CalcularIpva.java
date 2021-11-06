import java.util.Scanner;
public class CalcularIpva {
	public static void main(String args[]) {		
		Scanner in = new Scanner(System.in);		
		double preco, ipva;		
		System.out.println("Insira o valor de um veículo: ");		
		preco = in.nextDouble();
		ipva = (4*preco)/100;		
		System.out.println("O IPVA do veículo é: R$"+ipva);		
		in.close();				
	}

}