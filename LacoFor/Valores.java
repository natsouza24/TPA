import java.util.Scanner;
public class Valores {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int i, n, v, s=0, m, vp=0, vn=0, pp, pn;
		System.out.println("Insira a quantidade de valores: ");
		n = in.nextInt();
		for (i=1; i<=n; i++) {
			System.out.println("Insira o "+i+"° valor: ");
			v = in.nextInt();
			s = s+v;
			if (v>=0) {
				vp++;
			}else {
				vn++;
			}
		}
		in.close();
		m = s/n;
		System.out.println("\nA média dos valores é: "+m);
		System.out.println("\nQuantidade de valores positivos: "+vp);
		System.out.println("Quantidade de valores negativos: "+vn);
		pp = vp*100/n;
		pn = vn*100/n;
		System.out.println("\nPercentual dos valores positivos: "+pp+"%");
		System.out.println("Percentual dos valores negativos: "+pn+"%");
	}

}