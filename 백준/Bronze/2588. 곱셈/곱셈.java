import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;
		String b;
		int c;
		
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.next();
		
	
		c=Integer.parseInt(b.substring(2,3));
		System.out.println(a*c);
		
		c=Integer.parseInt(b.substring(1,2));
		System.out.println(a*c);
		
		c=Integer.parseInt(b.substring(0,1));
		System.out.println(a*c);
		
		System.out.println(a*Integer.parseInt(b));
		
	}

}
