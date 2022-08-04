import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		int t;
		int a;
		int b;

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		t = Integer.parseInt(br.readLine());

		
		for(int i=0; i<t; i++) {
			String[] arr=br.readLine().split(" ");
			
			a = Integer.parseInt(arr[0]);
			b = Integer.parseInt(arr[1]);
			
			bw.write(a+b+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
