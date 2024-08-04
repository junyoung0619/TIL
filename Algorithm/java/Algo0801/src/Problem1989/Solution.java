package Problem1989;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		sc.nextLine();
		for (int tc=1;tc<=T;tc++) {
			int check=1;
			String word = sc.nextLine(); 
			char[] charArr = word.toCharArray();
			int len = charArr.length;
			for(int i=0;i<=len/2;i++) {
				if (charArr[i] != charArr[len-1-i]) {
					check=0;
					break;
				}
			}
			System.out.printf("#%d %d\n",tc,check);
		}
	}
}
