package problem1222;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc=1;tc<=10;tc++) {
			int N=sc.nextInt();
			int sum=0;
			sc.nextLine();
			String str=sc.nextLine();
			for (int i=0;i<N;i++) {
				char ch=str.charAt(i);
				if (ch!='+') {
					int change = Character.getNumericValue(ch);
					sum+=change;
				}
			}
			System.out.printf("#%d %d\n",tc,sum);
		}
		sc.close();
	}
}

