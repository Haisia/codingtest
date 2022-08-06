import java.util.Scanner;

class Tool{
	
}

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count=0;
		int a=sc.nextInt();
		int b=sc.nextInt();
		boolean check=false;
		int min=0;
		
		
		for(int j=a; j<b+1; j++) {
			
			if(j==2) {
				count=count+2;
				if(check==false) {
					check=true;
					min=j;
				}
			}else if(j==1) {
			}else {
				for(int i=2; i<j; i++) {
					if(j%i==0) {
						break;
					}
					if(i==j-1) {
						count=count+j;
						if(check==false) {
							check=true;
							min=j;
						}
					}
				}
			}
		}
		if(check==false) {
			System.out.println(-1);
			return;
		}
		
		System.out.println(count);
		System.out.println(min);
	}
}

