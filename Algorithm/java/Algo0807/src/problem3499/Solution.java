package problem3499;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc=1;tc<=T;tc++) {
			int N=sc.nextInt();
			int count=0,plus=0;
			sc.nextLine();
			String str = sc.nextLine();
			String[] arr = str.split(" ");
			System.out.printf("#%d ",tc);
			while (true) {
				if(count==N)
					break;
				System.out.printf("%s ",arr[plus]);
				count+=1;
				if(count==N)
					break;
				System.out.printf("%s ",arr[plus+(N+1)/2]);
				count+=1;
				plus+=1;
			}
			System.out.println();
		}
	}
}
