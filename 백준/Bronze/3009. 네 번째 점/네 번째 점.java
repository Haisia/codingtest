import java.util.Scanner;

class Coordinate {
    public int x;
    public int y;
}

public class Main {
    public static void main(String[] args) {
        // 1. 입력

        Scanner sc = new Scanner(System.in);

        Coordinate p1 = new Coordinate();
        Coordinate p2 = new Coordinate();
        Coordinate p3 = new Coordinate();
        Coordinate p4 = new Coordinate();

        p1.x = sc.nextInt();
        p1.y = sc.nextInt();

        p2.x = sc.nextInt();
        p2.y = sc.nextInt();

        p3.x = sc.nextInt();
        p3.y = sc.nextInt();



        // 2. 처리
        // x값 끼리, y값 끼리 각각 비교하여 같은 값이 2번씩 나오도록 p4의 좌표를 설정.

        p4.x = p1.x==p2.x ? p3.x : ( p2.x==p3.x ? p1.x : p2.x);
        p4.y = p1.y==p2.y ? p3.y : ( p2.y==p3.y ? p1.y : p2.y);

        // 3. 출력
        System.out.println(p4.x+" "+p4.y);

    }
}