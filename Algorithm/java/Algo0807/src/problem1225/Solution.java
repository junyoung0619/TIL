package problem1225;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc=1;tc<=10;tc++) {
			int N = sc.nextInt();
			Queue<Integer> q = new LinkedList<>();
			for (int i=0;i<8;i++) {
				int num = sc.nextInt();
				q.add(num);
			}
			int check=1;
			while (true){
				int temp = q.poll();
				temp-=check;
				if (temp<=0) {
					temp=0;
					q.add(temp);
					break;
				}
				q.add(temp);
				check=check%5+1;
			}
			System.out.printf("#%d ",tc);
			while(!q.isEmpty()) {
				System.out.printf("%d ",q.poll());
			}
			System.out.println();
		}
	}
}
