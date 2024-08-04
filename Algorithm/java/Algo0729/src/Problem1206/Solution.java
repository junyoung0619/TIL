package Problem1206;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dx = {-2,-1,1,2};
		for (int i=1;i<=10;i++) {
			final int N = sc.nextInt();
			int[] input = new int[N];
			for (int j=0;j<N;j++) {
				input[j] = sc.nextInt();
			}
			int count=0;
			for (int j=2;j<N-2;j++) {
				int max=0;
				for (int k=0;k<4;k++) {
					if (max<input[j+dx[k]]){
						max = input[j+dx[k]];
					}
				}
				if (max<input[j]) {
					count+=input[j]-max;
				}
			}
			System.out.printf("#%d %d\n",i,count);
		}
		sc.close();
	}
}
