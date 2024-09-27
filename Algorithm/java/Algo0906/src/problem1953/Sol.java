package problem1953;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sol {
    
    static int D, W, K;
    static int[][] film, copyFilm;
    static int answer;
    static int[] A, B;
    static int idx;
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        for (int t = 1; t <= T; t++) {
            
            st = new StringTokenizer(br.readLine());
            D = Integer.parseInt(st.nextToken());        // 세로 길이
            W = Integer.parseInt(st.nextToken());        // 가로 길이
            K = Integer.parseInt(st.nextToken());        // 연속되어야 하는 개수
            
            film = new int[D][W];
            copyFilm = new int[D][W];
            
            for (int i = 0; i < D; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < W; j++) {
                    film[i][j] = Integer.parseInt(st.nextToken());
                    copyFilm[i][j] = film[i][j];
                }
            }
            
            
       
            A = new int[W];            // 이미 0으로 셋팅되어 있음
            B = new int[W];            // 1로 채울 것
            Arrays.fill(B, 1);
            
            answer = Integer.MAX_VALUE;
            
            
//            idx = 0;
            
            findAnswer(0, 0);

            
            
            
            sb.append("#").append(t).append(" ").append(answer).append("\n");
        }
        System.out.println(sb);
    }
    
    // 정답 찾자
    static void findAnswer(int depth, int cnt) {
        
        if (check(film)) {
            answer = Math.min(answer, cnt);
            

            
            return;
        }
        
        if (depth == D) {
            if (check(film)) {
                answer = Math.min(answer, cnt);
            }
            
            return;
        }
        
        // 안건드릴거야
        findAnswer(depth + 1, cnt);
        
        // A로 바꿀거야
        insert(depth, 0);
        findAnswer(depth + 1, cnt+1);
        undo(depth);
        
        // B로 바꿀거야
        insert(depth, 1);
        findAnswer(depth + 1, cnt+1);
        undo(depth);
        
    }
    
    
    // 원하는 가로줄에 A(0) or B(1) 삽입
    static void insert(int row, int AorB) {
        if (AorB == 0) {
            film[row] = A;
        } else {
            film[row] = B;
        }
    }
    
    // return 되었을 때 원상복귀
    static void undo(int row) {
        film[row] = copyFilm[row];
    }
    
    
    // 모든 세로줄에 k개의 연속된 숫자가 나오는지 확인
    static boolean check(int[][] film) {
        point:
        for (int col = 0; col < W; col++) {
            int cntCheck = 1;
            for (int row = 0; row < D - 1; row++) {
                if (film[row][col] == film[row + 1][col]) cntCheck++;
                else cntCheck = 1;
                
                if (cntCheck >= K) continue point;
            }
            return false;
        }
        return true;
    }

}