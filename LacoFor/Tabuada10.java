
public class Tabuada10 {
	public static void main(String args[]) {
		int i, n, r;
		for (i=1; i<=10; i++) {
			for (n=1; n<=10; n++) {
				r = i*n;
				System.out.println(i+" x "+n+" = "+r);
			}
			System.out.println();
		}
	}
	
}