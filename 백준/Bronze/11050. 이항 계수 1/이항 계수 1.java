import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a==b) {System.out.println(1); return;}
        System.out.println(myMath2(a, b) / myMath(a - b));

    }

    static int myMath(int a) {
        if (a <= 1) return a;
        else return a * myMath(a - 1);
    }

    static int myMath2(int a, int b) {
        if (a <= b + 1) return a;
        else return a * myMath2(a - 1, b);
    }
}
