import java.util.Scanner;
public class IdadeAlturaPeso {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int i, id, q=0;
		double a=0, p=0, s=0, maior=0, menor=0;
		for (i=1; i<=25; i++) {
			System.out.println("\nInsira a idade da "+i+"ª pessoa: ");
			id = in.nextInt();
			maior = id;
			menor = id;
			System.out.println("Insira a altura da "+i+"ª pessoa: ");
			a = in.nextDouble();
			System.out.println("Insira o peso da "+i+"ª pessoa: ");
			p = in.nextDouble();
			if(id>50) {
				q++;
			}
			if(id>=10 & id<=20) {
				a++;
				s = s + a;
			}
			if(p<40) {
				p++;
			}
			if(id>maior) {
				maior = id;
			}else if(id<menor){
				menor = id;
			}
		}
		in.close();
		System.out.println("\nQuantidade de pessoas com idade superior a 50 anos: "+q+"\n");
		s = s/a;
		System.out.println("A média das alturas das pessoas com idade entre 10 e 20 anos: "+s+"\n");
		a = a * 100 / (i-1);
		System.out.println("Porcentagem das pessoas com peso inferior a 40 quilos: "+p+"%\n");
		System.out.println("O peso da pessoa mais velha é: "+maior+"\n");
		System.out.println("O peso da pessoa mais nova é: "+menor);
	}

}