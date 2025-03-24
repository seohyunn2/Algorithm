import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Deque<int[]> deque = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 1; i <= n; i++) {
            int k = Integer.parseInt(st.nextToken());
            deque.offer(new int[] {i, k});
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
            int[] curr = deque.poll(); // 현재 풍선 (0 -> 풍선번호, 1 -> 이동수)
            ans[i] = curr[0]; // 풍선 번호
            int move = curr[1]; // 이동수

            if(deque.isEmpty()) {
                break;
            }
            if(move > 0) {
                for(int j = 0; j < move-1; j++) {
                    deque.offerLast(deque.pollFirst()); // 이동
                }
            } else {
                for(int j = 0; j < Math.abs(move); j++) {
                    deque.offerFirst(deque.pollLast()); // -니까 거꾸로 이동
                }
            }
        }

        for(int i = 0; i < n; i++) {
            bw.write(ans[i] + " ");
        }
        bw.flush();
        bw.close();

    }
}