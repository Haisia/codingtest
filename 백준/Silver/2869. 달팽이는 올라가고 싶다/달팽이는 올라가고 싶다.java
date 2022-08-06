import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		double a=Integer.parseInt(st.nextToken());
		double b=Integer.parseInt(st.nextToken());
		double v=Integer.parseInt(st.nextToken());
		int day;
		
		
		day=(int) (Math.ceil((v-a)/(a-b)))+1;
		bw.write(Integer.toString(day));
		bw.close();
	}
}
