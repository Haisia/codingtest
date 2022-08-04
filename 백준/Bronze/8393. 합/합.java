import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;
		int b;

		b=0;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		
		
		for(int i=1; i<a+1; i++) {
			b=b+i;
		}
		System.out.println(b);
	
		
	}
	
}
