import java.util.Scanner;
public class MaiorMenorAltura {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int a, maior=0, menor=999;
		for (int i=1; i<=15; i++) {
			System.out.println("Insira a altura da "+i+"ª pessoa: ");
			a = in.nextInt();
			if (a>maior) {
				maior = a;
			}else if (a<menor){
				menor = a;
			}
		}
		in.close();
		System.out.println("\nA maior altura é: "+maior);
		System.out.println("\nA menor altura é: "+menor);
	}

}

