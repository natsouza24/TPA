
public class Multiplo10 {
	public static void main(String args[]) {
		int i=0, m=10;
		do {
			i++;
			if (i % m == 0) {
				System.out.println(m+" - Número - Múltiplo de 10");
				m = m + 10;
			}else {
				System.out.println(i);
			}
		}while(m<=300);
	}

}