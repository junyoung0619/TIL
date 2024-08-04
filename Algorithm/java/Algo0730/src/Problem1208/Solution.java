package Problem1208;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc=1;tc<=10;tc++) {
			int count = sc.nextInt();
			int[] nums = new int[100];
			for(int i=0;i<100;i++)
			{
				nums[i]=sc.nextInt();
			}
			int diff=2;
			while (count>0 && diff>=2) {
				int max_index=0, min_index=0, max_value=0,min_value=101 ;
				int[] height= new int[101];
				for(int i=0;i<100;i++) {
					if (max_value<nums[i]) {
						max_value=nums[i];
						max_index=i;
					}
					if (min_value>nums[i]) {
						min_value=nums[i];
						min_index=i;
					}
					height[nums[i]]+=1;
				}
				nums[max_index]-=1;
				nums[min_index]+=1;
				if (height[max_value]>=2)
				{
					if(height[min_value]>=2) {
						diff=max_value-min_value;
					} else {
						diff=max_value-min_value-1;
					}
				} else if(height[min_value]>=2) {
					diff= max_value-min_value-1;
				} else {
					diff=max_value-min_value-2;
				}
				count-=1;
			}
			System.out.printf("#%d %d\n",tc,diff);
		}
		sc.close();
		
	}
}
