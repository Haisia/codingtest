import java.util.Scanner;

class Tool{
	public static void calc(int n) {
		
		for(int i=2; i<n+1; i++) {
			if(n%i==0 && n!=1) {
				System.out.println(i);
				n=n/i;
				calc(n);
				break;
			}
		}
	}
}

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		Tool.calc(n);
		
	}
}

