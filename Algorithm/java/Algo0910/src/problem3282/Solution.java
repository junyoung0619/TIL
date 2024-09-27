package problem3282;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(st.nextToken());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			int[][] dp = new int[N + 1][K + 1];
			int[][] arr = new int[N + 1][2];

			for (int i = 1; i <= N; i++) {
				st = new StringTokenizer(br.readLine());
				arr[i][0] = Integer.parseInt(st.nextToken());
				arr[i][1] = Integer.parseInt(st.nextToken());
			}

			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= K; j++) {
					if(arr[i][0]>j) {
						dp[i][j] = dp[i-1][j];
					} else {
						dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-arr[i][0]]+arr[i][1]);
					}
				}
			}
			sb.append("#").append(tc).append(" ").append(dp[N][K]).append("\n");
		}
		System.out.println(sb);

	}
}
