package Problem2068;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=1;i<=T;i++) {
			int[] nums = new int[10];
			for (int j=0;j<10;j++) {
				nums[j]=sc.nextInt();
			}
			Arrays.sort(nums);
			System.out.printf("#%d %d\n",i,nums[9]);
		}
		sc.close();
	}
}
