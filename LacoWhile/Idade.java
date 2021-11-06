import java.util.Scanner;
public class Idade {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int i=1, menor=0, maior=0, aa, an, idade;
		System.out.println("Insira o ano atual: ");
		aa = in.nextInt();
		while (i<=6) {
			System.out.println("Insira o ano de nascimento do "+i+"° usuário: ");
			an = in.nextInt();
			idade = aa-an;
			System.out.println("A idade é: "+idade);
			if (idade<18) {
				System.out.println("Menor de idade\n");
				menor = menor+1;
			}else {
				System.out.println("Maior de idade\n");
				maior = maior+1;
			}
			i++;
		}
		in.close();
	}

}