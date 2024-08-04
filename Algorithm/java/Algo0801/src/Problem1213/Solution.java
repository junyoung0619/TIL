package Problem1213;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc=1;tc<=10;tc++) {
			int N= sc.nextInt();
			sc.nextLine();
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();
			int len1 = str1.length();
			int len2 = str2.length();
			int count=0;
			outer:for (int i=0;i<len2-len1+1;i++) {
				for (int j=0;j<len1;j++) {
					if (str1.charAt(j)!=str2.charAt(i+j))
						continue outer;
				}
				count+=1;
			}
			System.out.printf("#%d %d\n",tc,count);
		}
	}
}
