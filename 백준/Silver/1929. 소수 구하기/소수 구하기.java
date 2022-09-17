import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. 입력
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        boolean[] isPrimeNumber = new boolean[n+1]; // n+1 : 인덱스 = 해당숫자 로 조절

        StringBuilder sb = new StringBuilder();

        // 2. 처리

        // 0과 1을 제외한 수의 상태를 'true' 로 변경
        for(int i=2; i<=n; i++){
            isPrimeNumber[i]=true;
        }

        // 소수가 아닌 수 들을 찾아서 'false' 로 변경
        for(int i=2; (i*i)<=n; i++){
            if(isPrimeNumber[i]){
                for(int j=i*i; j<=n; j+=i){
                    isPrimeNumber[j]=false;
                }
            }
        }
        // 3. 출력
        for(int i=m; i<=n; i++){
            if(isPrimeNumber[i]){
                System.out.println(i);
            }
        }
    }
}