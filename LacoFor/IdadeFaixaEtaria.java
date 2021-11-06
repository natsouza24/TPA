import java.util.Scanner;
public class IdadeFaixaEtaria {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int id, q1=0, q2=0, q3=0, q4=0, q5=0;
		double p1, p2, p3, p4, p5;
		for (int i=1; i<=15; i++) {
			System.out.println("\nInsira a idade da "+i+"ª pessoa: ");
			id = in.nextInt();
			if(id<=15) {
				System.out.println("Sua idade é da 1ª Faixa Etária");
				q1++;
			}else if(id<=30){
				System.out.println("Sua idade é da 2ª Faixa Etária");
				q2++;
				}else if(id<=45) {
					System.out.println("Sua idade é da 3ª Faixa Etária");
					q3++;
					}else if(id<=60) {
						System.out.println("Sua idade é da 4ª Faixa Etária");
						q4++;
						}else {
							System.out.println("Sua idade é da 5ª Faixa Etária");
							q5++;
			}
		}
		p1 = q1*100/15;
		p2 = q2*100/15;
		p3 = q3*100/15;
		p4 = q4*100/15;
		p5 = q5*100/15;
		
		System.out.println("\n1ª Faixa Etária");
		System.out.println("Quantidade: "+q1);
		System.out.println("Porcentagem: "+p1+"%");
		
		System.out.println("\n2ª Faixa Etária");
		System.out.println("Quantidade: "+q2);
		System.out.println("Porcentagem: "+p2+"%");
		
		System.out.println("\n3ª Faixa Etária");
		System.out.println("Quantidade: "+q3);
		System.out.println("Porcentagem: "+p3+"%");
		
		System.out.println("\n4ª Faixa Etária");
		System.out.println("Quantidade: "+q4);
		System.out.println("Porcentagem: "+p4+"%");
		
		System.out.println("\n5ª Faixa Etária");
		System.out.println("Quantidade: "+q5);
		System.out.println("Porcentagem: "+p5+"%");
		
		in.close();
	}
	
}