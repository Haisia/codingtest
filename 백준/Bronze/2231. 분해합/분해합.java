import java.util.Scanner;

class Tool{
}

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			String str = String.valueOf(i);
			char[] arr=new char[str.length()];
			arr=str.toCharArray();
			int temp=i;
			
			for(int j=0; j<str.length(); j++) {
				temp=temp+arr[j]-'0';
				
			}
			
			if(temp==n) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}
}