package Algo1954;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for (int tc=1;tc<=T;tc++) {
			int N=sc.nextInt();
			int[][] arr= new int[N][N];
			int[] dy = {0,1,0,-1};
			int[] dx = {1,0,-1,0};
			int k=1, y=0,x=N-1;
			int count=N-1;
			int num = N+1;
			for (int i=0;i<N;i++) {
				arr[0][i]=i+1;
			}
			here:while (true) {
				if (count==0) 
					break;
				for (int i=0;i<4;i++)
				{
					if(i==2) {
						count=count-1;
						if (count==0) 
							break here;
					}
					for(int j=0;j<count;j++) {
						x = x+dx[k];
						y = y+dy[k];
						arr[y][x]=num;
						num+=1;
					}
					k=(k+1)%4;
				}
				count-=1;
				
			}
			System.out.printf("#%d\n",tc);
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					System.out.printf("%d ",arr[i][j]);
				}
				System.out.println();
			}
			
		}
	}
}
