import java.util.Scanner;

class Tool{
	
}


public class Main {

	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		
		double a=st.nextDouble();
		double b=st.nextDouble();
		double c=st.nextDouble();
		int d;
		
		if(c>b) {
			d=(int)(a/(c-b))+1;
		}else {
			d=-1;
		}
		System.out.println(d);
	}
}

