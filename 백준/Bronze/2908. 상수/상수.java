import java.util.Scanner;

class Tool{
	public static boolean cheack(String a, String b){
		
		for(int i=2; i>-1;i--) {
			if(a.charAt(i)>b.charAt(i)) {
				return true;
			}else if(a.charAt(i)<b.charAt(i)){
				return false;
			}
		}
		return false;
	}
}


public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		String c;
		
		if(Tool.cheack(a, b)) {
			c=a;
		}else {
			c=b;
		}
	
		for(int i=2; i>-1; i--) {
			System.out.print(c.charAt(i));
		}
		
	}
}

