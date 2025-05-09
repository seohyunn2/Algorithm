import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

/*
*
* */

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = sc.nextInt();

        while (T-- > 0) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            LinkedList<int[]> q = new LinkedList<>();

            for (int i = 0; i < n; i++) {
                q.offer(new int[] { i, sc.nextInt() }); // 초기 위치, 중요도
            }

            int count = 0;

            while (!q.isEmpty()) {	// 한 케이스에 대한 반복문

                int[] front = q.poll();	// 가장 첫 원소
                boolean isMax = true;	// front 원소가 가장 큰 원소인지를 판단하는 변수

                // 큐에 남아있는 원소들과 중요도를 비교
                for(int i = 0; i < q.size(); i++) {

                    // 처음 뽑은 원소보다 큐에 있는 i번째 원소가 중요도가 클 경우
                    if(front[1] < q.get(i)[1]) {

                        // 뽑은 원소 및 i 이전의 원소들을 뒤로 보낸다.
                        q.offer(front);
                        for(int j = 0; j < i; j++) {
                            q.offer(q.poll());
                        }

                        // front원소가 가장 큰 원소가 아님 -> false를 하고 탐색을 마침
                        isMax = false;
                        break;
                    }
                }

                // front 원소가 가장 큰 원소가 아님 -> 넘어감
                if(!isMax) {
                    continue;
                }

                // front 원소가 가장 큰 원소 -> 출력
                count++;
                if(front[0] == m) {	
                    break;
                }

            }

            sb.append(count).append('\n');

        }
        System.out.println(sb);
    }
}