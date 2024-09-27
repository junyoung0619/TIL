package problem16504;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			int maximum = 0;
			st = new StringTokenizer(br.readLine());
			int W = Integer.parseInt(st.nextToken());
			boolean[][] arr1 = new boolean[W][100];
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<W;i++) {
				int a = Integer.parseInt(st.nextToken());
				for(int j=0;j<a;j++) {
					arr1[i][j] = true;
				}
			}
//			for(int i=0;i<W;i++) {
//				for(int j=0;j<8;j++) {
//					System.out.print(arr1[i][j]+" ");
//				}
//				System.out.println();
//			}
			for(int j=0;j<100;j++) {
				int count = 0;
				int cur = W;
				int i=W-1;
				while(i>=0) {
					if(arr1[i][j]) {
						count+=(cur-i-1);
						cur=i;
					}
					i-=1;
				}
				maximum = Math.max(maximum, count);
			}
			sb.append("#").append(tc).append(" ").append(maximum).append("\n");
		}
		System.out.println(sb);
	}
}
