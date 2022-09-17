import java.util.Scanner;

/**
 * 1. m과 n을 입력받는다.
 * 2. '에라토스테네스의 체' 를 사용하여 소수를 찾는다.
 *      - 범위 내의 모든 수의 상태를 'true' 로 놓고, 소수가 아닌 수를 찾아서 false 로 변경한다.
 *      - 소수가 아닌 모든 수는 (i^2 + k*i) 로 표현 가능 (k는 음수가 아닌 정수)
 *      - 위의 식에 해당하는 수의 상태를 'false' 로 변경
 * 3. m이상, n이하를 만족하는 소수를 출력한다.
 */

public class Main {
    public static void main(String[] args) {
        // 1. 입력
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            int originalN = n;
            int countPrime = 0;
            n *= 2;

            boolean[] isPrimeNumber = new boolean[n + 1]; // n+1 : 인덱스 = 해당숫자 로 조절

            StringBuilder sb = new StringBuilder();

            // 2. 처리

            // 0과 1을 제외한 수의 상태를 'true' 로 변경
            for (int i = 2; i <= n; i++) {
                isPrimeNumber[i] = true;
            }

            // 소수가 아닌 수 들을 찾아서 'false' 로 변경
            for (int i = 2; (i * i) <= n; i++) {
                if (isPrimeNumber[i]) {
                    for (int j = i * i; j <= n; j += i) {
                        isPrimeNumber[j] = false;
                    }
                }
            }
            // 3. 출력
            for (int i = originalN+1; i <= n; i++) {
                if (isPrimeNumber[i]) {
                    countPrime++;
                }
            }
            System.out.println(countPrime);
        }
    }
}