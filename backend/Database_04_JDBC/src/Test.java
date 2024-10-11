import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] dy = { 0, 0, 1, -1 }; // dy, dx로 델타배열을 구성하여 상하좌우로의 이동을 구현함
		int[] dx = { 1, -1, 0, 0 };
		for (int tc = 1; tc <= T; tc++) {
			int mini = 2001; // 모든 양분이 100이어도 양분총합이 2000이므로 차이가 2001을 넘을 수 없다.
			int total = 0; // 전체 양분의 합
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[][] arr = new int[N][M];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					arr[i][j] = sc.nextInt();
					total += arr[i][j];
				}
			}
			for (int i = 0; i < (1 << (N * M - 1)); i++) { // M*i+j 자리 수가 (i,j) 칸의 영역이 되며 (영역은 0 또는 1) (0,0)은 0에 속한다고
															// 설정하자. ((0,0)이 1인 경우는 전체 맵의 영역을 0과 1끼리 서로 바꾼다고 생각하면 (0,0)이 0인 하나의 경우와 항상 대응된다.)
				int a = i << 1; // 이를 맞추기 위해 i를 0 ~ (2^(N*M-1))로 맞추고 왼쪽으로 shift한 a를 사용할 것이다.
				int sum = 0; // 영역을 나눈 각 경우에 대해 (0,0)이 속한 0의 영역의 합을 나타낼 것이다.
				boolean[][] visited = new boolean[N][M]; // 이렇게 하면 (0,0)이 속한 0의 영역에 대해서만 계산하게 된다.
				Queue<int[]> queue = new LinkedList<>();
				queue.offer(new int[] { 0, 0 });
				while (!queue.isEmpty()) {
					int[] tmp = queue.poll();
					int y = tmp[0];
					int x = tmp[1];
					if (!visited[y][x]) {
						visited[y][x] = true;
						sum = sum + arr[y][x];
						for (int k = 0; k < 4; k++) {
							int ny = y + dy[k];
							int nx = x + dx[k];
							if (0 <= nx && nx < M && 0 <= ny && ny < N && !visited[ny][nx] // 만약 (ny,nx)가 범위 안에 있고 방문하지 않았으며 구역값이 0인 경우 ( 이를 a 와의 비트연산으로 판별한다.) queue에 추가																					
									&& ((a & (1 << (ny * M + nx))) == 0)) {
								queue.offer(new int[] { ny, nx });
							}
						}
					}
				}
				int sum2 = 0;				
				outer:for (int j = 0; j < N; j++) {
					for (int l = 0; l < M; l++) {
						
						// 이제 나머지 1의 영역들의 양분의 합에 대해 살펴볼 것인데
						// 맵을 탐색하며 처음으로 1이 나오는 영역에 대해 bfs를 할 것이다.
						
						if (((a & (1 << (j * M + l))) != 0)) {			
							Queue<int[]> queue2 = new LinkedList<>();
							queue2.offer(new int[] { j, l });
							while (!queue2.isEmpty()) {
								int[] tmp = queue2.poll();
								int y = tmp[0];
								int x = tmp[1];
								if (!visited[y][x]) {
									visited[y][x] = true;
									sum2 = sum2 + arr[y][x];
									for (int k = 0; k < 4; k++) {
										int ny = y + dy[k];
										int nx = x + dx[k];
										if (0 <= nx && nx < M && 0 <= ny && ny < N && !visited[ny][nx] // 만약 (ny,nx)가 범위 안에 있고 방문하지 않았으며 구역값이 1인 경우 ( 이를 a 와의 비트연산으로 판별한다.) queue2에 추가	
												&& ((a & (1 << (ny * M + nx))) != 0)) {
											queue2.offer(new int[] { ny, nx });
										}
									}
								}
							}
							break outer;	// 1로 이루어진 인접 영역 하나에 대해서만 수행하기 위해 한번 하면 그만한다.	
						}
					}
				}
				if(sum + sum2 == total) {						   // 결국엔 0으로 이루어진 인접 영역 중 하나, 1로 이루어진 인접 영역 중 하나에 대해 양분들의 합만 뽑은 것인데 이 둘의 양분의 합이 total과 같다면 영토를 조건에 맞게 분할한 것이다.
																   // 이렇게 풀게 되면 1의 영역이 하나도 없는 경우가 생기지만 각 양분이 양수이기 때문에 양분의 차의 최소를 구하는 부분에 대해 영향을 끼치지 못한다.
					mini = Math.min(mini, Math.abs(sum-sum2)); 	   // 이 때만 양분의 차이를 최신화한다.
				}
			}	
			System.out.println("#" + tc + " " + mini);
		}
		sc.close();
	}
}
