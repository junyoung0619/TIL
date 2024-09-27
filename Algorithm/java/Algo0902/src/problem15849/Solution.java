package problem15849;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	static int[] par;
 	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int Q =Integer.parseInt(st.nextToken());
			
			par = new int[N+1];
			int count = 0;
			
			for(int i=1;i<=N;i++) {
				par[i] =i;
			}
			
			for(int i=0;i<M;i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int p = union_find(a);
				int q = union_find(b);
				if(p==q) {
					continue;
				}
				par[q] = p;
			}
			for(int i=0 ; i<Q;i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				if(union_find(a)!=union_find(b)) {
					count+=1;
				}
			}
			sb.append("#").append(tc).append(" ").append(count).append("\n");
		}
		System.out.println(sb);
	}
 	static int union_find(int a) {
 		if(par[a]==a)
 			return a;
 		par[a] = union_find(par[a]);
 		return par[a];
 	}
}
