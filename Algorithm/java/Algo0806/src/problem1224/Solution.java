package problem1224;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	static Map<Character,Integer> map = new HashMap<>();
	static {
		map.put('+',1);
		map.put('-',1);
		map.put('*',2);
		map.put('/',2);
		map.put('(',0);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc=1;tc<=10;tc++) {
			int N=sc.nextInt();
			String result="";
			char[] stack= new char[N+1];
			int len=0;
			sc.nextLine();
			String str=sc.nextLine();
			for(int i=0;i<N;i++) {
				char ch=str.charAt(i);
				if('0'<=ch&&ch<='9' ) {
					result+=ch;
				} else if (ch==')'){
					while(stack[len-1]!='(') {
						result+=stack[len-1];
						len-=1;
					}
					len-=1;
				} else if (ch=='(') {
					stack[len]=ch;
					len+=1;
				} else {
					while (len>0&&map.get(stack[len-1])>=map.get(ch)) {
						result+=stack[len-1];
						len-=1;
					}
					stack[len]=ch;
					len+=1;
				}
			}
			while(len>0) {
				result+=stack[len-1];
				len-=1;
			}
			len=0;
			int[] stack2 = new int[N];
			for(int i=0;i<result.length();i++) {
				char ch=result.charAt(i);
				if ('0'<=ch && ch<='9') {
					int change= Character.getNumericValue(ch);
					stack2[len]=change;
					len+=1;
				} else {
					int a = stack2[len-1];
					int b = stack2[len-2];
					int c=0;
					switch(ch) {
						case '+':
							c=a+b;
							break;
						case '-':
							c=b-a;
							break;
						case '*':
							c=a*b;
							break;
						case '/':
							c=b/a;
							break;
							
					}
					stack2[len-2]=c;
					len-=1;
				}
			}
			System.out.printf("#%d %d\n",tc,stack2[0]);
		}
	}
}
