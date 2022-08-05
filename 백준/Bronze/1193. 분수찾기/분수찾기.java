import java.util.Scanner;

class Tool{
}

public class Main {

	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		int i=1;
		int n=st.nextInt();
		int s=0;
		int m=0;
		
		
		while(n!=1) {
			if(n<i*(i+1)/2||n==i*(i+1)/2) {
				break;
			}
			i++;
		}
		if(i%2==0) {
			s=n-((i*(i-1))/2);
		}else {
			s=i-((n-((i*(i-1))/2))-1);
		}
		m=i+1-s;
		System.out.println(s+"/"+m);
	}
}

