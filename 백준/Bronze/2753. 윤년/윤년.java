import java.util.Scanner;

class calc{
	public static boolean calc1(int a) {
		if(a%4==0){
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean calc2(int a) {
		if(a%100!=0){
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean calc3(int a) {
		if(a%400==0){
			return true;
		}else {
			return false;
		}
	}
	
}

public class Main {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		
		
		if(calc.calc1(a)==true && calc.calc2(a)==true ||
		   calc.calc1(a)==true && calc.calc3(a)==true ) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
		
	}
	

}
