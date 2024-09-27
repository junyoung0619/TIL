package problem1251;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			long[][] arr = new long[N][2];
			long[][] distance = new long[N][N];		
			long[] distance2 = new long[N];
			boolean[] visited = new boolean[N];
			
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<N;i++) {
				arr[i][0] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<N;i++) {
				arr[i][1] = Integer.parseInt(st.nextToken());
			}
			
			List<long[]> len = new ArrayList<>();
			for(int i=0;i<N-1;i++) {
				for(int j=i+1;j<N;j++) {
					distance[i][j] = (arr[i][0]-arr[j][0])*(arr[i][0]-arr[j][0])+(arr[i][1]-arr[j][1])*(arr[i][1]-arr[j][1]);
					distance[j][i] = distance[i][j];
				}
			}
			int count = 0;
			long sum = 0;
			for(int i=0;i<N;i++) {
				distance2[i] = Long.MAX_VALUE;
			}
			
			PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));
			pq.offer(new long[] {0,0});
			
			while(count<N) {
				long[] tmp = pq.poll();
				int idx = (int) tmp[1];
				if(visited[idx]) {
					continue;
				}
				visited[idx] = true;
				sum+=tmp[0];
				count+=1;
				for(int i=0;i<N;i++) {
					if(!visited[i] && distance2[i]>distance[idx][i]) {
						distance2[i] = distance[idx][i];
						pq.offer(new long[] {distance2[i],i});
					}
				}
			}
			
			st = new StringTokenizer(br.readLine());
			double E = Double.parseDouble(st.nextToken());
			double tmp = (double) sum;
			tmp = tmp*E;
			sum = Math.round(tmp);
			sb.append("#").append(tc).append(" ").append(sum).append("\n");	
		}
		System.out.println(sb);
	}
}
