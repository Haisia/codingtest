import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. 입력
    	Scanner sc = new Scanner(System.in);
    	int k = sc.nextInt();
    	int[][] arr = new int[2][6];
    	int max12=0;
    	int min12=0;
    	int max34=0;
    	int min34=0;
    	int max12I=0;
    	int max34I=0;
    	
    	for(int i=0; i<6; i++) {
    		arr[0][i]=sc.nextInt();
    		arr[1][i]=sc.nextInt();
    	}
    	
        // 2. 처리
    	for(int i=0; i<6;i++) {
    		if(arr[0][i]==1 || arr[0][i]==2) {
    			if(max12==0) {
    				max12=arr[1][i];
    				max12I=i;
    			}else if(arr[1][i]>max12) {
    				max12=arr[1][i];
    				max12I=i;
    			}
    		}else if(arr[0][i]==3 || arr[0][i]==4) {
    			if(max34==0) {
    				max34=arr[1][i];
    				max34I=i;
    			}else if(arr[1][i]>max34) {
    				max34=arr[1][i];
    				max34I=i;
    			}
    		}
    		
    	}
    	if(max34I-max12I==1 || max34I-max12I==-5) {
    		int temp = max34I+2;
    		
    		temp=temp%6;
    		
    		min34=arr[1][temp];	
    		min12=arr[1][(temp+1)%6];	
    		
    		
    	}
    	else if(max34I-max12I==-1 || max34I-max12I==5) {
    		int temp = max12I+2;
    		
    		temp=temp%6;
    		
    		min34=arr[1][temp];	
    		min12=arr[1][(temp+1)%6];	
    	}
    	
        // 3. 출력
    	System.out.println(k*((max12*max34)-(min12*min34)));
    }
}