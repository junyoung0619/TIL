package problem1859;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(st.nextToken());
		for (int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int[] arr = new int[N];
			for (int i=0;i<N;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			long max_sum=0;
			int bottom=arr[N-1];
			for(int i=N-2;i>=0;i--) {
				if(bottom>arr[i]){
					max_sum+=bottom-arr[i];
				}else{
					bottom=arr[i];
				}
			}
			sb.append("#").append(tc).append(" ").append(max_sum).append('\n');
			
		}
		System.out.println(sb);
	}
}
