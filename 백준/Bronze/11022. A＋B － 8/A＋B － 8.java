import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int t;
		
		t=sc.nextInt();
		
		for(int i=0; i<t; i++) {
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("Case #"+(i+1)+": "+a+" + "+b+" = "+(a+b));
		}
		
	}
}
