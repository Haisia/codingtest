import java.util.Scanner;

class Tool{
	public static int modi(int charNum){
		if(charNum<91) {
			charNum=charNum-65;
		}else {
			charNum=charNum-97;
		}
		return charNum;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int[] arr= new int[26];
		int largest=0;
		int largestIndex=0;
		char a;
		
		for(int i=0; i<str.length(); i++) {
			int charNum=str.charAt(i);
			arr[Tool.modi(charNum)]++;
		}
		
		for(int i=0; i<26; i++) {
			if(arr[i]>largest) {
				largestIndex=i+65;
				largest=arr[i];
			}else if(largest!=0 && largest==arr[i]) {
				largestIndex='?';
			}
		}

		System.out.println((char)largestIndex);
		
	}
}
