import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

// 3차원 BFS...
public class Main {
    static int M, N, H;
    static int[][][] map;
    static int[] dh = {0, 0, 0, 0, 1, -1}; // 위, 아래
    static int[] dr = {-1, 1, 0, 0, 0, 0}; // 상, 하
    static int[] dc = {0, 0, -1, 1, 0, 0}; // 좌, 우

    static class Point{
        int h, r, c;
        Point(int h, int r, int c) {
            this.h = h;
            this.r = r;
            this.c = c;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());

        M = Integer.parseInt(st.nextToken()); // 가로
        N = Integer.parseInt(st.nextToken()); // 세로
        H = Integer.parseInt(st.nextToken()); // 높이

        map = new int[H][N][M];
        Queue<Point> queue = new ArrayDeque<>();

        // 익은 토마토는 다 맵에 넣음\
        for (int h = 0; h < H; h++) {
            for (int r = 0; r < N; r++) {
                st = new StringTokenizer(in.readLine());
                for (int c = 0; c < M; c++) {
                    map[h][r][c] = Integer.parseInt(st.nextToken());
                    if (map[h][r][c] == 1) {
                        queue.offer(new Point(h, r, c));
                    }
                }
            }
        }
        bfs(queue);
    
        // 출력
        int max = 0;
        for (int h = 0; h < H; h++) {
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < M; c++) {
                    if (map[h][r][c] == 0) {
                        System.out.println(-1);
                        return;
                    }
                    max = Math.max(max, map[h][r][c]);
                }
            }
        }
        System.out.println(max - 1);
    }

    public static void bfs(Queue<Point> queue) {
        while (!queue.isEmpty()) {
            Point cur = queue.poll();

            for (int i = 0; i < 6; i++) {
                int nh = cur.h + dh[i];
                int nr = cur.r + dr[i];
                int nc = cur.c + dc[i];

                if (nh < 0 || nh >= H || nr < 0 || nr >= N || nc < 0 || nc >= M) continue;
                if (map[nh][nr][nc] == 0) {
                    map[nh][nr][nc] = map[cur.h][cur.r][cur.c] + 1;
                    queue.offer(new Point(nh, nr, nc));
                }
            }
        }
    }
}