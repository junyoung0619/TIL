package Problem1210;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] dy= {0,0,-1};
		int [] dx= {1,-1,0};
		for (int tc=1;tc<=10;tc++) {
			int N = sc.nextInt();
			int[][] arr = new int[100][100];
			int start_y=99;
			int start_x=0;
			for(int i=0;i<100;i++)
			{
				for(int j=0;j<100;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			for(int j=0;j<100;j++)
			{
				if (arr[99][j]==2) {
					start_x=j;
					break;
				}
			}
			while (start_y>0) {
				for(int k=0;k<3;k++) {
					int ny=start_y+dy[k];
					int nx=start_x+dx[k];
					if(0<=ny&& ny<99 &&0<=nx&&nx<=99 && arr[ny][nx]==1) {
						start_x=nx;
						start_y=ny;
						arr[ny][nx]=0;
						break;
					}
				}
			}
			System.out.printf("#%d %d\n",tc,start_x);
		}
	}
}
