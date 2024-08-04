package Problem1216;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(int tc=1;tc<=10;tc++) {
			int N=sc.nextInt();
			int max_count=0;
			sc.nextLine();
			char[][] arr = new char[100][100];
			for(int i=0;i<100;i++) {
				String str=sc.nextLine();
				arr[i]=str.toCharArray();
			}
			for (int i=0;i<100;i++) {
				for (int j=0;j<100;j++) {
					for(int k=j;k<100;k++) {
						int check=1;
						for(int l=0;l<=(k-j+1)/2;l++) {
							if (arr[i][j+l]!=arr[i][k-l]) {
								check=0;
								break;
							}
						}
						if (check==1 && max_count<k-j+1)
							max_count=k-j+1;
					}
				}
			
			}
			for (int i=0;i<100;i++) {
				for (int j=0;j<100;j++) {
					for(int k=j;k<100;k++) {
						int check=1;
						for(int l=0;l<=(k-j+1)/2;l++) {
							if (arr[j+l][i]!=arr[k-l][i]) {
								check=0;
								break;
							}
						}
						if (check==1 && max_count<k-j+1)
							max_count=k-j+1;
					}
				}
			
			}
			System.out.println("#" + N + " " + max_count);
			
		}
	}
}
