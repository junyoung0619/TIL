package Problem1984;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for (int tc=1;tc<=T;tc++) {
			int[] nums=new int[10];
			int sum=0;
			for (int i=0;i<10;i++) {
				nums[i]=sc.nextInt();
			}
			Arrays.sort(nums);
			for (int i=1;i<9;i++) {
				sum+=nums[i];
			}
			double result = (double)sum /8;
			System.out.printf("#%d %d\n",tc,Math.round(result));
		}
	}
}
