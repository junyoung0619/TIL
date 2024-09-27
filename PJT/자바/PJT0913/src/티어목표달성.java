import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 티어목표달성 {
	static String[] tier = { "아이언4", "아이언3", "아이언2", "아이언1", "브론즈4", "브론즈3", "브론즈2", "브론즈1", "실버4", "실버3", "실버2", "실버1",
			"골드4", "골드3", "골드2", "골드1", "플레티넘4", "플레티넘3", "플레티넘2", "플레티넘1", "에메랄드4", "에메랄드3", "에메랄드2", "에메랄드1",
			"다이아몬드4", "다이아몬드3", "다이아몬드2", "다이아몬드1", "마스터", "그랜드마스터", "챌린저" };
	static Map<String, Integer> average_power = new HashMap<>();
	static Map<String, Integer> LP = new HashMap<>();

	static class Player {
		String cur_tier;
		int lp; 		// 현재 lp
		int power; 		// 실력
		int win; 		// 이긴 횟수
		int lose; 		// 진 횟수

		public Player(String cur_tier, int lp, int power) {
			this.cur_tier = cur_tier;
			this.lp = lp;
			this.power = power;
			this.win = 0;
			this.lose = 0;

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 31; i++) {
			average_power.put(tier[i], (1 << i) + 30);
			if (i <= 28) {
				LP.put(tier[i], i * 100);
			}
		}
		LP.put("그랜드마스터", 3000);
		LP.put("챌린저", 3300);


		while (true) {

			System.out.print("현재 티어를 입력하세요.: ");
			String start = sc.next();
			System.out.print("목표 티어를 입력하세요.: ");
			String end = sc.next();
			Player player = new Player(start, LP.get(start), average_power.get(start));

			while (player.lp < LP.get(end)) {
				double prob = probability(player.power, average_power.get(player.cur_tier));
				double ran = Math.random();
				player.power = player.power + (int) (average_power.get(player.cur_tier) * (-0.01 + 0.025 * Math.random()));
				if (ran < prob) {
					player.win += 1;
					player.lp += 25;
					player.cur_tier = to_tier(player.lp);
				} else {
					player.lose += 1;
					player.lp -= 25;
					if (player.lp < 0) {
						player.lp = 0;
					}
					player.cur_tier = to_tier(player.lp);
				}

			}
			System.out.printf("예상 판수: %d판 \n승: %d \n패: %d \n승률: %.2f%%\n", player.win + player.lose, player.win,
					player.lose, (double) player.win / (player.lose + player.win) * 100);
			System.out.println("종료하고 싶으면 0을, 계속하고 싶으면 1을 입력하세요");
			int a = sc.nextInt();
			if (a == 0) {
				break;
			}
		}
	}

	public static String to_tier(int lp) {
		if (lp < 3000) {
			return tier[lp / 100];
		}
		if (lp < 3300) {
			return "그랜드마스터";
		}
		return "챌린저";
	}

	public static double probability(int p, int t) {
		double s = (double) p / (p + t);
		s = 0.4 + 0.2 * s;
		return s;

	}
}
