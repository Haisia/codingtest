import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,b;
		n=sc.nextInt();
		int[] a = new int[n];
		
		
		b=sc.nextInt();
		
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			if(a[i]<b) {
				System.out.println(a[i]);
			}
		}
		
		
	}
}
