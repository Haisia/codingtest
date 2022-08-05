import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		
		
		for(int k=0; k<a; k++) {
			int b= sc.nextInt();
			String str=sc.next();
			for(int i=0; i<str.length(); i++) {
				for(int j=0; j<b; j++) {
					System.out.print(str.charAt(i));
				}
			}
			System.out.println();
		}
	}
}
