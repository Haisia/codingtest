import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		int m;
		
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		m = a*60+b;
		m=m+c;
		
		if(m>1439) {
		m=m-1440;	
		}
		
		
		a=m/60;
		b=m%60;

		System.out.println(a+" "+b);
		
	}
}
