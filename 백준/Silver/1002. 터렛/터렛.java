import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            // 1. 입력
            
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();
            
            // 2. 처리 & 출력
            // (x1,y1)과 (x2,y2)의 거리를 계산하고(d), 거리에 따른 해의 갯수를 판단한다.
            double d = Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)), 0.5);


            if (x1 == x2 && y1 == y2 && r1 == r2) {
                System.out.println(-1);
            } else if (d > (r1 + r2) || d < Math.abs(r2 - r1)) {
                System.out.println(0);
            } else if (d == r1 + r2 || d == Math.abs(r2 - r1)) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }
}