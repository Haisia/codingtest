import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		
		if(a==0 && b<45) {
		c=b+1395;	
		}else {
		c=a*60+b-45;
		}
		a=c/60;
		b=c%60;

		System.out.println(a+" "+b);
		
	}
}
