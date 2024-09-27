package problem1970;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int[] price = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };

		int T = Integer.parseInt(st.nextToken());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			sb.append("#").append(tc).append("\n");
			for (int i = 0; i < 8; i++) {
				sb.append(N/ price[i]).append(" ");
				N = N % price[i];
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
