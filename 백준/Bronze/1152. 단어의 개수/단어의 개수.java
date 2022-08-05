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
		String str=sc.nextLine();
		int count=1;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==' ') {
			count++;	
			}
		}
		
		if(str.charAt(0)==' ') {count--;}
		if(str.charAt(str.length()-1)==' ') {count--;}
		
		
		System.out.println(count);
		
	}
}
