package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class BOJ_10026 {
    static int N;
    static char[][] map; // 일반 맵
    static char[][] newMap; // 적록색약 맵
    static boolean[][] visited;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(in.readLine());
        map = new char[N][N];

        for (int i = 0; i < N; i++) {
            map[i] = in.readLine().toCharArray();
        }

        visited = new boolean[N][N];
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    bfs(i, j, map[i][j]);
                    count++;
                }
            }
        }

        // 적록색약이 보는 맵 R -> G
        newMap = new char[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 'R') newMap[i][j] = 'G';
                else newMap[i][j] = map[i][j];
            }
        }
        visited = new boolean[N][N];
        int newCount = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    newBfs(i, j, newMap[i][j]);
                    newCount++;
                }
            }
        }
        System.out.print(count + " " + newCount);

    }
    static void bfs(int r, int c, char color) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{r, c});
        visited[r][c] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int row = cur[0];
            int col = cur[1];

            for (int i = 0; i < 4; i++) {
                int nr = row + dr[i];
                int nc = col + dc[i];

                if (nr < 0 || nr >= N || nc < 0 || nc >= N) continue;
                if (!visited[nr][nc] && map[nr][nc] == color) {
                    visited[nr][nc] = true;
                    queue.offer(new int[]{nr, nc});
                }
            }
        }
    }

    static void newBfs(int r, int c, char color) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{r, c});
        visited[r][c] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int row = cur[0];
            int col = cur[1];

            for (int i = 0; i < 4; i++) {
                int nr = row + dr[i];
                int nc = col + dc[i];

                if (nr < 0 || nr >= N || nc < 0 || nc >= N) continue;
                if (!visited[nr][nc] && newMap[nr][nc] == color) {
                    visited[nr][nc] = true;
                    queue.offer(new int[]{nr, nc});
                }
            }
        }
    }

}