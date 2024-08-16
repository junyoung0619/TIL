import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int min = sc.nextInt();
		int max = sc.nextInt();
		int result=1001;
		int[] count1 = new int[101];
		int[] count2 = new int[101];
		int[] arr= new int[N];
		for (int i=0;i<N;i++) {
			int a= sc.nextInt();
			arr[i]=a;
			count1[a]+=1;
		}
		for(int i=1;i<=100;i++) {
			count2[i]=count2[i-1]+count1[i];
		}
		Arrays.sort(arr);
		int len=arr.length;
		for(int score1=arr[0];score1<arr[len-1];score1++) {
			for(int score2=score1+1;score2<=arr[len-1];score2++) {
				int a1 = count2[score1-1];
				int a2 = count2[score2-1]-count2[score1-1];
				int a3 = N-count2[score2-1];
				if(a1<min||a1>max||a2<min||a2>max||a3<min||a3>max) {
					continue;
				} else {
					int result2=0;
					if((a1-a2)*(a1-a3)<=0) {
						result2=Math.abs(a2-a3);
					} else if ((a2-a1)*(a2-a3)<=0) {
						result2=Math.abs(a1-a3);
					} else {
						result2=Math.abs(a1-a2);
					}
					if (result>result2)
						result=result2;
				}
			}
		}
		if (result==1001){
			System.out.println(-1);
		} else {
			System.out.println(result);
		}
		
		
	}
}
