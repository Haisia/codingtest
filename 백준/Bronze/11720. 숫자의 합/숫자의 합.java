import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String str=sc.next();
		int sum=0;
		
		for(int i=0; i<a; i++) {
			sum=sum+Character.getNumericValue(str.charAt(i));
		}
		System.out.println(sum);
		
	}
}
