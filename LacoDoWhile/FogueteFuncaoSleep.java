
public class FogueteFuncaoSleep {
	public static void main(String args[]) throws InterruptedException{
		int f=11;
		do {
			f = f-1;
			System.out.println(f);
			Thread.sleep(1000);
		}while(f!=0);
		System.out.println("FOGO!!");
	}
}