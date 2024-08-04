package Problem1966;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		for (int tc=1;tc<=T;tc++) {
			int N=sc.nextInt();
			int[] arr=new int[N];
			for(int i=0;i<N;i++) {
				arr[i]=sc.nextInt();
			}
			for(int i=0;i<N-1;i++) {
				for(int j=0;j<N-1-i;j++) {
					if(arr[j]>arr[j+1]) {
						int temp = arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			System.out.printf("#%d ",tc);
			for(int i:arr) {
				System.out.printf("%d ",i);
			}
			System.out.println();
		}
	}
}
