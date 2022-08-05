import java.util.Scanner;

class Tool{
}

public class Main {

	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		int i=1;
		int n=st.nextInt();
		
		
		if(n==1) {
			System.out.println(1);
			return;
		}
		
		while(true) {
			if(n<3*i*(i+1)+2) {
				System.out.println(i+1);
				break;
			}
			i++;
		}
	}
}

