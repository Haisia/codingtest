import java.util.Scanner;

class Tool{
	
}


public class Main {

	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		int a=st.nextInt();
		int count=0;
		
		for(int j=0; j<a; j++) {
			String str=st.next();
			char[] arr= str.toCharArray();
			boolean[] alphabet=new boolean[26];
			
			
			for(int i=0; i<str.length(); i++) {
				if( (i+1)<str.length() && arr[i]!=arr[i+1]) {
					if(alphabet[arr[i]-'a']==false) {
						alphabet[arr[i]-'a'] = true;
					}else {
						break;
					}
				}else if(alphabet[arr[i]-'a']==true){
						break;
				}
				if(i==str.length()-1) {
					count++;
				}
			}
		}
		
		System.out.println(count);
		
	}
}

