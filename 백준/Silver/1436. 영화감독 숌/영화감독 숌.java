import java.util.Scanner;

class Tool{
}

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=666; i!=-1; i++){
			char[] arr = String.valueOf(i).toCharArray();
			for(int j=0; j<arr.length-2; j++) {
				if(arr[j]=='6' && arr[j+1]=='6' && arr[j+2]=='6') {
					n--;
					if(n==0) {
						System.out.println(i);
						return;
					}
					break;
				}
			}
		}
	}
}