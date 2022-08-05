//import java.util.Scanner;

class Sn{
	public static int getNextNum(int num) {
		int nextNum=num;
		int digit;				//num의 자리수. ex) num이 4231일때 4가된다
		int temp=num;
		
		digit=(int) (Math.log10(num)+1);	
		int[] digitNum=new int[digit];
		
		
		for(int i=0; i<digit; i++) {
			digitNum[i]= temp/(int)Math.pow(10, digit-1-i);
			temp=(int) (temp-digitNum[i]*Math.pow(10, digit-1-i));
			nextNum=nextNum+digitNum[i];
		}
		
		//System.out.println(nextNum);
		return nextNum;
	}
	
	public static void printSelfNum(boolean[] cheackSelfNum) {
		for(int i=1; i<cheackSelfNum.length; i++) {
			if(cheackSelfNum[i]==false) {
				System.out.println(i);
			}
		}
	}
}

public class Main {

	public static void main(String[] args) {
		int testCase=10000;
		boolean[] cheackSelfNum=new boolean[testCase+1];
		
		for(int i=1; i<testCase+1; i++) {
			if(Sn.getNextNum(i)<testCase+1) {
				cheackSelfNum[Sn.getNextNum(i)]=true;
			}
		}
		
		Sn.printSelfNum(cheackSelfNum);

		
	}
}
