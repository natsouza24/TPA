import java.util.Scanner;
public class CalcularIpva {
	public static void main(String args[]) {		
		Scanner in = new Scanner(System.in);		
		double preco, ipva;		
		System.out.println("Insira o valor de um ve�culo: ");		
		preco = in.nextDouble();
		ipva = (4*preco)/100;		
		System.out.println("O IPVA do ve�culo �: R$"+ipva);		
		in.close();				
	}

}