package Problem2001;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T=sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int N=sc.nextInt();
			int M=sc.nextInt();
			int[][] arr= new int[N][N];
			int max_count=0;
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			for (int i=0;i<N-M+1;i++) {
				for(int j=0;j<N-M+1;j++) {
					int count=0;
					for(int k=i;k<i+M;k++) {
						for(int l=j;l<j+M;l++) {
							count+=arr[k][l];
						}
					}
					if(max_count<count) 
						max_count=count;
				}
			}
			System.out.printf("#%d %d\n",tc,max_count);
		}
	}
}
