package Problem8931;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int K = sc.nextInt();
			int[] arr = new int[K];
			int len=0;
			int sum=0;
			for(int i=0;i<K;i++) {
				int num = sc.nextInt();
				if (num==0) {
					sum-=arr[len-1];
					arr[len-1]=0;
					len-=1;
				} else {
					arr[len]=num;
					sum+=num;
					len+=1;
				}
			}
			System.out.printf("#%d %d\n",tc,sum);
		}
	}
}
