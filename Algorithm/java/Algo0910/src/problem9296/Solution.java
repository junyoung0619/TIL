package problem9296;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	static int[] arr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for (int tc = 1; tc <= 5; tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			arr = new int[N + 1];
			System.out.println(f(N));
		}
	}

	static int f(int n) {
		if (arr[n] != 0) {
			return arr[n];
		}
		if (n == 1) {
			arr[n] = 1;
			return 1;
		}
		if (n == 2) {
			arr[n] = 1;
			return 1;
		}
		arr[n] = f(n - 1) + f(n - 2);
		return arr[n];
	}
}
