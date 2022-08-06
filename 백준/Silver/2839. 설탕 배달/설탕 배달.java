import java.util.Scanner;

class Tool{
	
}

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = 0;
		
		if(n==4||n==7) {
			System.out.println("-1");
			return;
		}
		
		if(n%5==0) {
			b=0;
		}else if(n%5==1){b=2;
		}else if(n%5==2){b=4;
		}else if(n%5==3){b=1;
		}else if(n%5==4){b=3;
		}

		System.out.println(b+(n-3*b)/5);
	}
}

