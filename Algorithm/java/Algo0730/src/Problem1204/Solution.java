package Problem1204;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T=sc.nextInt();
		for (int tc=1;tc<=T;tc++) {
			int n=sc.nextInt();
			int[] scores=new int[101];
			int count=0;
			int index=0;
			for (int i=0;i<1000;i++) {
				int score=sc.nextInt();
				scores[score]+=1;
			}
			for (int i=0;i<101;i++) {
				if(count<=scores[i]) {
					count=scores[i];
					index=i;
				}
			}
			System.out.printf("#%d %d\n",tc,index);
		}
	}
}
