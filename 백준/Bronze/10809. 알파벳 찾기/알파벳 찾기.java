import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int[] arr = new int[26];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]= -1;
		}
		
		
		for(int i=0; i<str.length(); i++) {
			int j=Character.getNumericValue(str.charAt(i))-10;
			if(arr[j]==-1) {
				arr[j] = i;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
}
