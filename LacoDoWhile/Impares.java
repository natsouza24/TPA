import java.util.Scanner;
public class Impares {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int i=1, n;
		System.out.println("Leia o enésimo termo: ");
		n = in.nextInt();
		do{
			System.out.print(i+", ");
			i = i+2;
		}while(i<=n);
		in.close();
	}

}