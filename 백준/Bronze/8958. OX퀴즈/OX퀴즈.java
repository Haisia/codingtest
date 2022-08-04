import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;

		
		a=sc.nextInt();
		for(int i=0; i<a; i++) {
			int point=1;
			int total=0;
			char[] arr = sc.next().toCharArray();
				for(char j:arr) {
					if(j=='O') {
						total=total+point;
						point=point+1;
					}else if(j=='X'){
						point=1;
					}
				}
		System.out.println(total);
		}
	}
}
