import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		int max;
		int min;
		
		a=sc.nextInt();
		int[] arr = new int[a];
		
		for(int i=0; i<a; i++) {
			arr[i]=sc.nextInt();
		}
		
		min=arr[0];
		max=arr[0];
		
		
		for(int i=0; i<a; i++) {
			
			if(arr[i]<min) {
				min=arr[i];
			}
			
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println(min);
		System.out.println(max);
	}
}
