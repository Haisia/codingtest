import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i=0; i<t; i++) {
			double h = sc.nextInt();
			double w = sc.nextInt();
			double n = sc.nextInt();
			int x,y;
			String a,b;
			
			x=(int) Math.ceil(n/h);
			y=(int) (n-h*(x-1));
			
			if(x<10) {
				a="0"+String.valueOf(x);
				b=String.valueOf(y);
			}else {
				a=String.valueOf(x);
				b=String.valueOf(y);
			}
			
			System.out.println(b+a);
		}
	}
}

