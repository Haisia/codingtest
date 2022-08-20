import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            map.put(str, i+1);
            list.add(str);
        }

        for (int i = 0; i < m; i++) {
            String input = br.readLine();
            try {   // 입력이 숫자일 때
                sb.append(list.get(Integer.parseInt(input)-1));
            } catch (Exception e) { // 입력이 문자 일때
//                sb.append(map.values().stream()
//                        .filter(poke->poke.getName().equals(input))
//                        .findAny().get().getNum()+"\n");
                sb.append(map.get(input));
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}