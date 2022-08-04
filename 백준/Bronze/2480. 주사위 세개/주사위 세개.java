import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int money;
		
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		
		if(cheack(a,b,c)){
			money = 10000+a*1000;
		}else if(!cheack(a,b,c) && a==b) 
		{
			money=1000+a*100;
		}else if(!cheack(a,b,c) && b==c) 
		{
			money=1000+b*100;
		}else if(!cheack(a,b,c) && c==a) 
		{
			money=1000+c*100;
		}else {
			money=Math.max(a,b);
			money=Math.max(money, c)*100;
		}
		System.out.println(money);
		
	}
	
	public static boolean cheack(int a, int b, int c) {
		if(a==b && b==c && c==a) {
			return true;
		}else {
			return false;
		}
	}
	
}
