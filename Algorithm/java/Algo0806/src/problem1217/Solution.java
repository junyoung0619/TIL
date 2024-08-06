package problem1217;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc=1;tc<=10;tc++) {
			int N=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			int ans=1;
			ans=multi(a,b);
			System.out.printf("#%d %d\n",tc,ans);
		}
	}
	static int multi(int a,int b) {
		if(b==0) {
			return 1;
		}
		return a*multi(a,b-1);
	}
}
