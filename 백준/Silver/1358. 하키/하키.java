import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        double r = H / 2;
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int P = sc.nextInt();
        int cnt=0;


        for (int i = 0; i < P; i++) {
            int pX = sc.nextInt();
            int pY = sc.nextInt();
            boolean condition1 = false;
            boolean condition2 = false;
            boolean condition3 = false;
            // 1. 조건1. 왼쪽 원안에 있는경우
            if (Math.pow((X - pX), 2) + Math.pow((Y + r - pY), 2) <= Math.pow(r, 2)) condition1 = true;

            // 2. 조건2. 오른쪽 원안에 있는경우
            if (Math.pow((X + W - pX), 2) + Math.pow((Y + r - pY), 2) <= Math.pow(r, 2)) condition2 = true;

            // 3. 조건3. 사각형 안에 있는 경우
            if (((pX >= X) && (pX <= (X + W))) && ((pY >= Y) && (pY <= Y + H))) condition3 = true;

            if(condition1 || condition2 || condition3) cnt++;
        }
        System.out.println(cnt);
    }
}