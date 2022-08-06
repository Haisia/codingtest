import java.util.Scanner;

class Tool{
}

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr = new int[n][2];  //arr[0][0]=0번사람의 몸무게, arr[0][1]=키
		int[] rank = new int[n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<n; j++) {
				if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1] ) {
					rank[i]++; //0부터시작이라 출력할때 +1해줘야됨
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(rank[i]+1);
		}
		
	}
}