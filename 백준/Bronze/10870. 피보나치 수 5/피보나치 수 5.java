import java.util.Scanner;

class Tool{
	public static int calc(int n) {

		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}
		return calc(n-1)+calc(n-2);
	}
}

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(Tool.calc(n));
		
		
	}
}