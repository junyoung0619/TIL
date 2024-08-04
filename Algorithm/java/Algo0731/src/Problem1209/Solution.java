package Problem1209;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc=1;tc<=10;tc++)
		{
			int N=sc.nextInt();
			int[][] arr=new int[100][100];
			int max_count=0;
			for(int i=0;i<100;i++) {
				for(int j=0;j<100;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			int count1=0;
			int count2=0;
			for (int i=0;i<100;i++) {
				count1+=arr[i][i];
				count2+=arr[i][99-i];
			}
			max_count=count1;
			for (int i=0;i<100;i++) {
				int count3=0;
				int count4=0;
				for (int j=0;j<100;j++) {
					count3+=arr[i][j];
					count4+=arr[j][i];
				}
				if (max_count<count3)
					max_count=count3;
					
				if (max_count<count4)
					max_count=count4;
			}
			if (max_count<count2)
				max_count=count2;
			
			System.out.printf("#%d %d\n",tc,max_count);
			
		}	
	}
}
