import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		int c=0;
		int num=42;
		int[] arr = new int[10];
		int[] arr2= new int[num];
		
		for(int i=0; i<10; i++) {
			arr[i]=sc.nextInt();
			arr2[arr[i]%num]=arr2[arr[i]%num]+1;
		}
		
		for(int i=0; i<num; i++) {
			if(arr2[i]!=0) {
				c=c+1;
			}
		}
		System.out.println(c);
		
		
		
		
	}
}
