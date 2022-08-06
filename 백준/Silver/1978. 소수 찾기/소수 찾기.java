import java.util.Scanner;

class Tool{
	
}

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count=0;
		int a=sc.nextInt();
		
		for(int j=0; j<a; j++) {
			int n=sc.nextInt();
			
			if(n==2) {
				count++;
			}else if(n==1) {
			}else {
				for(int i=2; i<n; i++) {
					if(n%i==0) {
						break;
					}
					if(i==n-1) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}

