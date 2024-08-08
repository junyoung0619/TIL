package problem7102;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			if (N<M) {
				int temp=N;
				N=M;
				M=temp;
			}
			System.out.printf("#%d ",tc);
			for (int i=M+1;i<N+2;i++) {
				System.out.printf("%d ",i);
			}
			System.out.println();
		}
	}
}
