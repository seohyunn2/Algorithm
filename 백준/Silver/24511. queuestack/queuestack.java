import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;
// 문제 이해가 안돼서 구글링함 ㅠㅠ
// 스택 : 어차피 넣은 값을 빼는거라 의미 X -> 큐만 생각하면 됨 (앞에서 넣고 뒤에서 뺀다)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] A = new int[n];

        for(int i = 0; i < n;i++){
            A[i] = Integer.valueOf(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();

        for(int i = 0; i < n; i++){
            int tmp = Integer.parseInt(st.nextToken());
            if(A[i] == 0){ // 큐일때만 넣어두기
                queue.offer(tmp);
            }
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < m; i++){
            int tmp = Integer.parseInt(st.nextToken());
            queue.offerFirst(tmp);
            sb.append(queue.pollLast() + " ");
        }
        System.out.println(sb.toString());
    }
}