import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		int max=1;
		int count=9;
		
		for(int i=0; i<count; i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>arr[max]) {
				max=i;
			}
		}
		
		System.out.println(arr[max]);
		System.out.println(max+1);
	}
}
