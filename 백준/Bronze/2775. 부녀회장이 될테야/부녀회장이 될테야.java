import java.util.Scanner;

class Tool{
	public static int calc(int k, int n){
		if(k==0) {
			return n;
		}else if(n==0) {
			return 0;
		}
		return calc(k-1,n)+calc(k,n-1);
	}
}



public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i=0; i<t; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(Tool.calc(k, n));
		}
	}
}

