import java.util.Scanner;
public class Tabuada {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n, r;
		System.out.println("Insira um número: ");
		n = in.nextInt();
		for (int i=1; i<=10; i++) {
			r = i*n;
			System.out.println(i+" x "+n+" = "+r+"\n");
		}
		in.close();
	}

}

