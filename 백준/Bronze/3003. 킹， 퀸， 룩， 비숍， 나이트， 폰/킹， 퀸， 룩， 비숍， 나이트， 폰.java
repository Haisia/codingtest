import java.math.BigInteger;
import java.util.Scanner;

class Tool{
	
}

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] arr= new int[6];
		for(int i=0; i<6; i++) {
			arr[i]=sc.nextInt();
		}
		
		
		System.out.println(1-arr[0]);
		System.out.println(1-arr[1]);
		System.out.println(2-arr[2]);
		System.out.println(2-arr[3]);
		System.out.println(2-arr[4]);
		System.out.println(8-arr[5]);
		
		
	}
}

