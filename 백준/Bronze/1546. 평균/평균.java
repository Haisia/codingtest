import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int max=0;
		int sum=0;
		double avg;
		
		a=sc.nextInt();
		int[] arr = new int[a];
		
		for(int i=0; i<a; i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>max) {
				max=arr[i];
			}
			sum=sum+arr[i];
		}
		
		avg=sum*100;
		avg=avg/a;
		avg=avg/max;
		
		System.out.println(avg);
		

	}
}
