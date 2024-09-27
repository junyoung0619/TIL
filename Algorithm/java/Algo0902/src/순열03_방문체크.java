import java.util.Arrays;

public class 순열03_방문체크 {
	static int[] nums;
	static int N;
	// 추가적인 공간 필요
	static boolean[] visited;
	static int[] result;

	public static void main(String[] args) {
		nums = new int[] { 0, 1, 2 };
		N = nums.length;
		visited = new boolean[N];
		result = new int[N];
		perm(0);
	}// main
		// idx : 현재 판단 위치

	// idx : 결과 배열에 저장할 위치
	static void perm(int idx) {
		// 기저조건
		if (idx == N) {
			System.out.println(Arrays.toString(result));
			return;
		}
		// 재귀부분
		for (int i = 0; i < N; i++) {
			// 사용하지 않은 원소를 가지고 만들어야해!
			// 1. 사용했으면 넘어가 continue;
			// 2. 사용하지 않았다면 if() { 요기작성 }
			if (visited[i])
				continue; // 1번 방식을 취함.
			result[idx] = nums[i];
			visited[i] = true; // 해당 i번쨰 원소는 사용했습니다.
			perm(idx + 1); // 다음 자리 판단.
			visited[i] = false; // result는 덮어버리니까 굳이 초기화 할 필요는 없음.

		}

	}

}
