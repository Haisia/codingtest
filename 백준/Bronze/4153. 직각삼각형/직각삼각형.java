import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1. 입력
        Scanner sc = new Scanner(System.in);

        while(true) {

            int[] len = new int[3];
            len[0] = sc.nextInt();
            len[1] = sc.nextInt();
            len[2] = sc.nextInt();
            int temp;

            // 1-1. 모든 len이 0이라면 종료
            if(len[0]==0 && len[1]==0 && len[2]==0)
                break;

            // 1-2 len 을 오름차순으로 정렬
            for (int j = 0; j < 2; j++) {
                for (int i = j; i < 2; i++) {
                    if (len[i] > len[i + 1]) {
                        temp = len[i + 1];
                        len[i + 1] = len[i];
                        len[i] = temp;
                    }
                }
            }
            // 2. 처리 & 출력
            if (Math.pow(len[0], 2) + Math.pow(len[1], 2) == Math.pow(len[2], 2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}