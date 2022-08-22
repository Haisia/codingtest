import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int[] arr = new int[n];
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        num2 = arr[1] - arr[0];

        for (int i = 0; i < arr.length - 2; i++) {
            num1 = arr[i + 2] - arr[i + 1];
            num2 = calc(num1, num2);
        }

        for (int i = 2; i <= Math.sqrt(num2); i++) {

            if (i * i == num2) {
                list.add(i);
            }
            else if (num2 % i == 0) {
                list.add(i);
                list.add(num2 / i);
            }
        }
        list.add(num2);
        Collections.sort(list);
        for (Integer i : list) {
            sb.append(i+" ");
        }
        System.out.println(sb.toString());
    }

    public static int calc(int a, int b) {
        while (b != 0) {
            int k = a % b;
            a = b;
            b = k;
        }
        return a;
    }
}