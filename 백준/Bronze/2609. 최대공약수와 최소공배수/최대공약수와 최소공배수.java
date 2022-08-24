import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];

        arr[0]=sc.nextInt();
        arr[1]=sc.nextInt();
        Arrays.sort(arr);

        int gcf=tool(arr[0],arr[1]);
        System.out.println(gcf);

        System.out.println((arr[0]/gcf)*(arr[1]/gcf)*gcf);

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