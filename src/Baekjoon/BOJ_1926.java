package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1926 {
    static int N, M;
    static int[][] map;
    static boolean[][] visited;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt = 0;
        int maxSize = 0;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(map[i][j] == 1 && !visited[i][j]) {
                    cnt++;
                    maxSize = Math.max(maxSize, bfs(i, j));
                }
            }
        }
        System.out.println(cnt);
        System.out.println(maxSize);

    }
    public static int bfs(int r, int c) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {r, c});
        visited[r][c] = true;

        int size = 1;

        while(!queue.isEmpty()) {
            int cur[] = queue.poll();
            int row = cur[0];
            int col = cur[1];

            for(int i = 0; i < 4; i++) {
                int nr = row + dr[i];
                int nc = col + dc[i];

                if (nr < 0 || nr >= N || nc < 0 || nc >= M) continue;
                if (!visited[nr][nc] && map[nr][nc] == 1) {
                    visited[nr][nc] = true;
                    queue.offer(new int[]{nr, nc});
                    size++;
                }
            }
        }
        return size;
    }
}
