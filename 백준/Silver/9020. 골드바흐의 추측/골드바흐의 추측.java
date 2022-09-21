import java.util.Scanner;

/**
 * 1. '에라토스테네스의 체' 를 사용하여 maxPrimeNumber 이하의 소수를 찾는다.
 * - 범위 내의 모든 수의 상태를 'true' 로 놓고, 소수가 아닌 수를 찾아서 false 로 변경한다.
 * - 소수가 아닌 모든 수는 (i^2 + k*i) 로 표현 가능 (k는 음수가 아닌 정수)
 * - 위의 식에 해당하는 수의 상태를 'false' 로 변경
 * 2. 입력받은 n 의 골드바흐 파티션을 찾아 출력한다.
 */

public class Main {
    public static void main(String[] args) {
        // 1. 입력
        Scanner sc = new Scanner(System.in);

        final int maxPrimeNumber = 10000;
        int countPrime = 0;
        boolean[] isPrimeNumber = new boolean[maxPrimeNumber + 1]; // maxPrimeNumber+1 : 인덱스 = 해당숫자 로 조절
        StringBuilder sb = new StringBuilder();

        //테스트 케이스 관련 입력
        int testcaseCount = sc.nextInt();

        for (int t = 0; t < testcaseCount; t++) {
            int n = sc.nextInt();
            // 2. 처리
            // 0과 1을 제외한 수의 상태를 'true' 로 변경
            for (int i = 2; i <= maxPrimeNumber; i++) {
                isPrimeNumber[i] = true;
            }

            // 소수가 아닌 수 들을 찾아서 'false' 로 변경
            for (int i = 2; (i * i) <= maxPrimeNumber; i++) {
                if (isPrimeNumber[i]) {
                    for (int j = i * i; j <= maxPrimeNumber; j += i) {
                        isPrimeNumber[j] = false;
                    }
                }
            }
            // maxPrimeNumber 보다 작은 소수 찾기 끝

            // 입력받은 테스트 케이스로 부터 골드바흐 파티션 찾고 출력
            for (int i = n / 2; i > 1; i--) {
                if (isPrimeNumber[i] && isPrimeNumber[n - i]) {
                    System.out.println(i + " " + (n - i));
                    break;
                }
            }
        }
    }
}