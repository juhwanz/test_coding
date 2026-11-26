import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 여기에 풀이
        int min = 1000000;
        int max = -1000000;
        
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		for(int i = 0; i<n; i++){
			int x = Integer.parseInt(st.nextToken());
			if(x < min) min = x;
			if(x > max) max = x;
		}

		sb.append(min).append(' ').append(max);
		
        System.out.print(sb);
    }
}
