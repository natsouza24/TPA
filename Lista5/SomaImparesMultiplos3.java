
public class SomaImparesMultiplos3 {
	public static void main(String args[]) {
		int s=0;
		for (int i=1; i<=500; i=i+2) {
			if (i % 3 == 0) {
				s = s + i;
			}
		}
		System.out.println("A soma dos números ímpares múltiplos de 3 do conjunto de 1 a 500 é: "+s);
	}

}