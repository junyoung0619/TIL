package Problem1218;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc=1;tc<=10;tc++) {
			int N= sc.nextInt();
			sc.nextLine();
			String str1=sc.nextLine();
			int check=1;
			char[] check_array= new char[N];
			int check_len=0;
			for (int i=0;i<N;i++) {
				char ch = str1.charAt(i);
				if(ch=='(' || ch=='['||ch=='{'||ch=='<') {
					check_array[check_len]=ch;
					check_len+=1;
				} else if(ch==')') {
					char ch2=check_array[check_len-1];
					if (ch2=='(') {
						check_len-=1;
						continue;
					} else {
						check=0;
						break;
					}
				} else if(ch==']') {
					char ch2=check_array[check_len-1];
					if (ch2=='[') {
						check_len-=1;
						continue;
					} else {
						check=0;
						break;
					}
				} else if(ch=='}') {
					char ch2=check_array[check_len-1];
					if (ch2=='{') {
						check_len-=1;
						continue;
					} else {
						check=0;
						break;
					}
				} else if(ch=='>') {
					char ch2=check_array[check_len-1];
					if (ch2=='<') {
						check_len-=1;
						continue;
					} else {
						check=0;
						break;
					}
				}
				
			}
			if (check_len>0)
				check=0;
			System.out.printf("#%d %d\n",tc,check);
		}
	}
}
