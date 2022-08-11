import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. 입력

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        // 2. 처리
        // min 은 x, y, w-x, h-y 중 의 최솟값

        int min = Math.min(Math.min(Math.min(x,y), w-x) , h-y);

        // 3. 출력

        System.out.println(min);
    }
}