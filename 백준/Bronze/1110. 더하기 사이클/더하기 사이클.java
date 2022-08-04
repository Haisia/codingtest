import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b=-1;
		int i=0;
		
		a=sc.nextInt();
		b=a;
		
		while(true) {

			i=i+1;
			b=(b%10)*10+(b/10+b%10)%10;
			
			if(a==b) {
				break;
			}
			
			}
		
		System.out.println(i);
		
	}
}
