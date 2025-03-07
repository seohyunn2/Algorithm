import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // 1부터 n까지 집어넣기
        for(int i = 0; i < n; i++) {
            deque.add(i+1);
        }
        List<Integer> res = new ArrayList<>();
        while(!deque.isEmpty()) {
            for(int i = 0; i < k-1; i++) {
                int p = deque.poll();
                deque.add(p);
            }
//            System.out.println(deque);
            int r = deque.remove();
            res.add(r);
        }
        System.out.print("<");
        for(int i = 0; i < res.size(); i++) {
            if (i != res.size() - 1){
                System.out.printf("%d, ", res.get(i));
            } else {
                System.out.printf("%d", res.get(i));
            }
        }
        System.out.print(">");
    }
}