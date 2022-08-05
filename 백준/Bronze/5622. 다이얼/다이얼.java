import java.util.Scanner;

class Tool{
	
}


public class Main {

	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		String str=st.next();
		int arr[] = new int[8];
		int time=0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)<'P') {
				arr[(str.charAt(i)-'A')/3]++;
			}else if(str.charAt(i)>'O' && str.charAt(i)<'T') {
				arr[5]++;
			} else if(str.charAt(i)>'S' && str.charAt(i)<'W'){
				arr[6]++;
			} else {
				arr[7]++;
			}
		}
		
		for(int i=0; i<8; i++) {
			time=time+arr[i]*(i+3);
		}
		
		System.out.println(time);
		
		
	}
}

