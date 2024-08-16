import java.util.Scanner;

public class Test2 {
	static int N=0;
	static int diff=2001;
	static int max=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N =sc.nextInt();
		int[] arr = new int[N];	
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		btk(0,0,0,arr);
		System.out.println(max);
	}
	public static void btk(int a, int sum1,int sum2,int[] arr) {
		if(a==N) {
			if(sum1<sum2){
				int tmp=sum1;
				sum1=sum2;
				sum2=tmp;
			}
			if(sum1-sum2<diff) {
				diff=sum1-sum2;
				max=sum1;
			}
			return;
		}
		btk(a+1,sum1+arr[a],sum2,arr);
		btk(a+1,sum1,sum2+arr[a],arr);
	}
}
