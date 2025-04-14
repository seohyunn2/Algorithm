package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_7576 {
    static int N, M;
    static int[][] map;
    static Queue<int[]> queue = new ArrayDeque<>();
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                }
            }
        }

        bfs();

        int ans = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if (map[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                ans = Math.max(ans, map[i][j]);
            }
        } System.out.println(ans-1);
    }

    public static void bfs() {
        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int row = cur[0];
            int col = cur[1];

            for(int i = 0; i < 4; i++) {
                int nr = row + dr[i];
                int nc = col + dc[i];

                if(nr < 0 || nr >= N || nc < 0 || nc >= M) continue;
                if(map[nr][nc] == 0) {
                    map[nr][nc] = map[row][col] + 1;
                    queue.offer(new int[]{nr, nc});
                }
            }
        }
    }
}
