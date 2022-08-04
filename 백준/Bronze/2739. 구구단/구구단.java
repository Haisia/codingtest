import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;

		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();

		
		for(int i=0; i<9; i++) {
			System.out.println(a+" * "+(i+1)+" = "+a*(i+1));
		}
	
		
	}
	
}
