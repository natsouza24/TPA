import java.util.Scanner;
public class AnoBissexto {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int ab=0, a, af;
		System.out.println("Insira o ano inicial: ");
		a = in.nextInt();
		System.out.println("Insira o ano final: ");
		af = in.nextInt();
		System.out.print("\nOs anos bissextos são: ");
		do {
			if(a % 4 == 0 & a % 100 != 0 | a % 400 == 0) {
				System.out.print(a+", ");
				a = a+4;
				ab++;
			}else {
				a++;
			}
		}while(a<=af);
		in.close();
		System.out.println("\n\nQuantidade de anos bissextos: "+ab);
	}

}

