import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int cnt=0;

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=0; i<n; i++)
            list.add(sc.next());

        for(int i=0; i<m; i++)
            if(list.contains(sc.next()))
                cnt++;

        System.out.println(cnt);
    }
}