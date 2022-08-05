import java.util.Scanner;

class Sn{
	public static boolean cheackNum(int num) {
		int digit;				//num의 자리수. ex) num이 4231일때 4가된다
		int temp=num;
		int dif;
		
		digit=(int) (Math.log10(num)+1);	
		int[] digitNum=new int[digit];
		
		
		for(int i=0; i<digit; i++) {
			digitNum[i]= temp/(int)Math.pow(10, digit-1-i);
			temp=(int) (temp-digitNum[i]*Math.pow(10, digit-1-i));
		}
		
		dif=digitNum[1]-digitNum[0];
		
		for(int i=1; i<digit-1; i++) {
			if(digitNum[i+1]-digitNum[i]!=dif) {
				return false;
			}
		}
		return true;
	}
	
	public static void cheackFlag(boolean[] cheackSelfNum) {
		for(int i=1; i<cheackSelfNum.length; i++) {
			if(cheackSelfNum[i]==false) {
			}
		}
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		boolean[] arr=new boolean[testCase+1];
		int count=99;
		
		if(testCase<100) {
			System.out.println(testCase);
			return;
		}else{
			for(int i=100; i<testCase+1; i++) {
				arr[i]=Sn.cheackNum(i);
				
			}
		}
		
		for(int i=100; i<testCase+1; i++) {
			if(arr[i]==true){
				count=count+1;
			}
		}
		
		System.out.println(count);
	}
}
