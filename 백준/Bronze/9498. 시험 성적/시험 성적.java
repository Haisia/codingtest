import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;
		
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		if(a>89) {
			System.out.println("A");
		}else if(a>79) {
			System.out.println("B");
		}else if(a>69) {
			System.out.println("C");
		}else if(a>59) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		
		
	}

}
