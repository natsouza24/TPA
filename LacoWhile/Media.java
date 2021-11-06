import java.util.Scanner;
public class Media {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int i=1;
		double n1, n2, m;
		while (i<=5){
			System.out.println("Digite a 1ª nota do "+i+"º aluno:");
			n1 = in.nextDouble();
			System.out.println("Digite a 2ª nota do "+i+"º aluno:");
			n2 = in.nextDouble();
			m = (n1+n2)/2;
			System.out.println("A média é: "+m);
			if (m>=6){
				System.out.println("Aprovado\n");
			}else {
				System.out.println("Reprovado\n");
			}
			i++;
		}
		in.close();
	}
	
}