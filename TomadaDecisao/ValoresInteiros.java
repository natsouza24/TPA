import java.util.Scanner;
public class ValoresInteiros {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int a, b, c;
		System.out.println("Insira o valor de A:");
		a = in.nextInt();
		System.out.println("Insira o valor de B:");
		b = in.nextInt();
		System.out.println("Insira o valor de C:");
		c = in.nextInt();
		if (a<b & b<c) {
			System.out.println("\nOs valores inteiros são: "+a+", "+b+" e "+c);
		}else if (a<c & c<b) {
			System.out.println("\nOs valores inteiros são: "+a+", "+c+" e "+b);
		    }else if (b<a & a<c) {
		    	System.out.println("\nOs valores inteiros são: "+b+", "+a+" e "+c);
		        }else if (b<c & c<a) {
		        	System.out.println("\nOs valores inteiros são: "+b+", "+c+" e "+a);
		            }else if (c<a & a<b) {
		            	System.out.println("\nOs valores inteiros são: "+c+", "+a+" e "+b);
		                }else {
		                	System.out.println("\nOs valores inteiros são: "+c+", "+b+" e "+a);
		}
		in.close();
	}

}