import java.util.Scanner;

public class Main {
    public static double getDistance(int x, int y, int cx, int cy) {
        double distance = Math.pow((Math.pow(cx - x, 2) + Math.pow(cy - y, 2)), 0.5);

        return distance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int j = 0; j < t; j++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int n = sc.nextInt();
            int[][] c = new int[n][2];      //  c[n][0] = cn의 x좌표 , c[n][1] = cn의 y좌표
            double[] r = new double[n];           //  r[n] 은 n번째 원의 반지름
            double[][] d = new double[n][2]; // d[n][0] 은 출발점과의 거리, d[n][1] 은 도착점과의 거리
            boolean[][] check = new boolean[n][2];
            for (int i = 0; i < n; i++) {
                c[i][0] = sc.nextInt();
                c[i][1] = sc.nextInt();
                r[i] = sc.nextInt();

                d[i][0] = getDistance(x1, y1, c[i][0], c[i][1]);
                d[i][1] = getDistance(x2, y2, c[i][0], c[i][1]);

                if (d[i][0] < r[i]) {
                    check[i][0] = true;
                } else {
                    check[i][0] = false;
                }

                if (d[i][1] < r[i]) {
                    check[i][1] = true;
                } else {
                    check[i][1] = false;
                }
            }
            int cnt = 0;
            for (int i = 0; i < n; i++) {

                if (check[i][0] ^ check[i][1]) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}