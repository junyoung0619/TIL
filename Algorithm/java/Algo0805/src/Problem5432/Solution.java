package Problem5432;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for (int tc=1;tc<=T;tc++) {
			int sum=0,check1=0,check2=0,i=0;
			String str= sc.nextLine();
			int len = str.length();
			while (i<len-1){
				if (str.charAt(i)=='(' &&str.charAt(i+1)==')') {
					sum+=check1;
					check1-=check2;
					check2=0;
					i+=2;
				} else if (str.charAt(i)=='('){
					check1+=1;
					i+=1;
				} else {
					check2+=1;
					i+=1;
				}
			}
			if (str.charAt(len-2)==')' &&str.charAt(len-1)==')')
				sum+=check1;
			
			System.out.printf("#%d %d\n",tc,sum);
		}
	}
}
