import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Main {
	static int N;
    static char[][] map;
    static boolean[][] visits;
    static int[] dr = {-1,0,0,1};
    static int[] dc = {0,1,-1,0};
    // 새로운 구역 찾았을 때 좌표 저장
    static Queue<int[]> q = new ArrayDeque<>();

    public static void main(String[] args) throws Exception{

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(in.readLine());
        map = new char[N][N];
        visits = new boolean[N][N];

        for (int i=0; i<N; i++){
            // toCharArray(): 문자열을 문자 배열로 변환하는 함수
        	map[i] = in.readLine().toCharArray();
        }

        int dltoniosm = 0, nonDltonism = 0, cnt = 0;

        // 비적록색약인을 위한 구획 탐색
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(!visits[i][j]) { // 방문하지 않은 노드는 새로운 구역
//                    dfs(i, j);
                    bfs(i, j);
                    cnt++;
                }
            }
        }
        nonDltonism = cnt;
        cnt = 0;

        // 적록색약인을 위한 탐색
        // visits 초기화
        // 한 번이면 이렇게 새로 생성하는 것도 ㄱㅊ
        visits = new boolean[N][N];
//        for(int i = 0; i < N; i++) {
//            Arrays.fill(visits[i], false);
//        }
        // G -> R   R -> G 변경
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(map[i][j] == 'G') {
                    map[i][j] = 'R';
                }
            }
        }
        // 구획 탐색
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(!visits[i][j]) { // 방문하지 않은 노드는 새로운 구역 -> dfs 돌기
//                    dfs(i, j);
                    bfs(i, j);
                    cnt++; // 구역 개수 카운트
                }
            }
        }
        dltoniosm = cnt;
        System.out.println(nonDltonism+" " +dltoniosm);
    }
 
    public static void dfs(int r, int c ){
        visits[r][c] = true;
        char color = map[r][c];

        for(int i =0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if(nr < 0 || nr >= N || nc < 0 || nc >= N) continue;
//              방문하지 않았고      상하좌우가 같은 컬러일 때
            if(!visits[nr][nc] && map[nr][nc] == color) {
                dfs(nr, nc); // 걔네도 들어가봐야되니까 다시 dfs 호출
            }

        }
    }

    public static void bfs(int r, int c) {
        q.offer(new int[] {r, c});
        visits[r][c] = true;
        char color = map[r][c];
        int nr, nc;

        while(!q.isEmpty()) {
            // 현재 위치 꺼내서
            int[] cur = q.poll();
            // 상하 좌우 탐색
            for(int i = 0; i < 4; i++) {
                nr = r + dr[i];
                nc = c + dc[i];
                // 경계 안에 있고 방문 안했고 같은 색상인 경우에만 큐에 추가
                if(nr < 0 || nr >= N || nc < 0 || nc >= N) continue;
                if(visits[nr][nc]) continue;
                if(map[nr][nc] != color) continue;
                bfs(nr, nc);
            }

        }
    }
}