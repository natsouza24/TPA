import java.util.Scanner;
public class Idade {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int i=1, menor=0, maior=0, idade;
		while (i<=10) {
			System.out.println("Insira a idade do "+i+"° aluno:");
			idade = in.nextInt();
			if (idade<18) {
				System.out.println("Menor de idade\n");
				menor++;
			}else {
				System.out.println("Maior de idade\n");
				maior++;
			}
			i++;
		}
		in.close();
		System.out.println("Quantidade de menores de idade: "+menor);
		System.out.println("Quantidade de maiores de idade: "+maior);
	}
    
}