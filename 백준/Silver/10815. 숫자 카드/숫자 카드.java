import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int[] arr= new int[n];

        for (int i = 0; i < n; i++)
            arr[i]=sc.nextInt();

        Arrays.sort(arr);

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            if (Arrays.binarySearch(arr,sc.nextInt())>=0) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }
        System.out.println(sb.toString());
    }
}