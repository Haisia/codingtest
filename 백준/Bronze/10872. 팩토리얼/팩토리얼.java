import java.util.Scanner;

class Tool{
	public static int calc(int n) {

		if(n==1||n==0) {
			return 1;
		}
		
		return n*calc(n-1);
	}
}

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(Tool.calc(n));
		
		
	}
}