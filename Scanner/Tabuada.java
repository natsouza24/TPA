import java.util.Scanner;
public class Tabuada {
	public static void main(String args[]) {		
		Scanner in = new Scanner(System.in);		
		int n, n2, n3, n4, n5, n6, n7, n8, n9, n10;		
		System.out.println("Insira o número a ser multiplicado: ");		
		n = in.nextInt();
		n2 = n*2;
		n3 = n*3;
		n4 = n*4;
		n5 = n*5;
		n6 = n*6;
		n7 = n*7;
		n8 = n*8;
		n9 = n*9;
		n10 = n*10;		
		System.out.println("\nTabuada do "+n+"\n"); 
		System.out.println(n+" x 1 = "+n);
		System.out.println(n+" x 2 = "+n2);
		System.out.println(n+" x 3 = "+n3);
		System.out.println(n+" x 4 = "+n4);
		System.out.println(n+" x 5 = "+n5);
		System.out.println(n+" x 6 = "+n6);
		System.out.println(n+" x 7 = "+n7);
		System.out.println(n+" x 8 = "+n8);
		System.out.println(n+" x 9 = "+n9);
		System.out.println(n+" x 10 = "+n10);		
		in.close();
	}

}