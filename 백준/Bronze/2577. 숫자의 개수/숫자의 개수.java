import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,num;
		int[] arr= {0,0,0,0,0,0,0,0,0,0};
		int temp = 0;
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		num=a*b*c;
		
		
		d=(int)Math.log10(num);
		d=(int)Math.pow(10, d);
		
		
		
		while(true){
			temp=num/d;
			
			arr[temp]=arr[temp]+1;
			if(d==1) {
				break;
			}
			num=num-(temp*d);
			d=d/10;
		}
		
		
		
		for(int i=0; i<10; i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}
}
