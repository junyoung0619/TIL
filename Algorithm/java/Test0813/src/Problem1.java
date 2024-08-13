import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		int[] answer = new int[10];
		int[] score = new int[10];
		int min = 101;
		int max = -1;
		int total = 0;
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<10;i++) {
			answer[i] = sc.nextInt();
		}
		for (int i=0;i<10;i++) {
			int sum=0;
			for (int j=0;j<10;j++) {
				int a = sc.nextInt();
				if (a==answer[j])
					sum+=10;
			}
			score[i]=sum;
			total+=sum;
			if (min>sum)
				min=sum;
			if(max<sum)
				max=sum;
		}
		total=total-max-min;
		if (total%8>=4) {
			System.out.println((total/8+1));
		} else {
			System.out.println(total/8);
		}
	}
}
