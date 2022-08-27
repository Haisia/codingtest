import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];

        for(int i=0; i<t; i++) {
            arr[i]=sc.nextInt();

            if(i!=0){
                int gcf = tool(arr[i],arr[0]);
                System.out.println(arr[0]/gcf+"/"+arr[i]/gcf);
            }
        }
    }

    static int tool(int a, int b){
        int c;

        while(a!=0) {
            c = b % a;
            b = a;
            a = c;
        }
        return b;
    }
}