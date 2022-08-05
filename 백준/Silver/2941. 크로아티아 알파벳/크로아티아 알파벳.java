import java.util.Scanner;

class Tool{
	
}


public class Main {

	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		String str=st.next();
		int count=0;
		
		char[] arr= str.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			if(      (i+1) <arr.length && arr[i]=='c' && (arr[i+1]=='=' || arr[i+1]=='-')  ){  //c= 또는 c-판별
				count++;
				i=i+1;
			}else if((i+2) <arr.length && arr[i]=='d' && arr[i+1]=='z' && arr[i+2]=='=') { //dz= 판별
				count++;
				i=i+2;
			}else if((i+1) <arr.length && arr[i]=='d' && arr[i+1]=='-') { //d- 판별
				count++;
				i=i+1;
			}else if((i+1) <arr.length && arr[i]=='l' && arr[i+1]=='j') {
				count++;
				i=i+1;
			}else if((i+1) <arr.length && arr[i]=='n' && arr[i+1]=='j') {
				count++;
				i=i+1;
			}else if((i+1) <arr.length && arr[i]=='s' && arr[i+1]=='=') {
				count++;
				i=i+1;
			}else if((i+1) <arr.length && arr[i]=='z' && arr[i+1]=='=') {
				count++;
				i=i+1;
			}else {
				count++;
			}
		}
		System.out.println(count);
		
	}
}

