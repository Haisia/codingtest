import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		
		a=sc.nextInt();
		for(int i=0; i<a; i++) {
			int b=sc.nextInt();
			int[] arr= new int[b];
			int sum=0;
			for(int j=0; j<b; j++) {
				arr[j]=sc.nextInt();
				sum=sum+arr[j];
			}
			
			double avg=sum/b;
			int highScoreCount=0;
			for(int k=0; k<b; k++) {
				if((double)arr[k]>avg) {
					highScoreCount=highScoreCount+1;
				}
			}
			
			System.out.printf("%.3f",(double)highScoreCount*100/(double)b);
			System.out.println("%");
		}
		
	}
}
