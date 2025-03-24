package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> q = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());



        while(n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");	// 문자열 분리
            String k = st.nextToken();
            switch(k) {

                case "push":
                    q.offer(Integer.parseInt(st.nextToken()));
                    break;

                case "pop" :
                    Integer item = q.poll();
                    if(item == null) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(item).append('\n');
                    }
                    break;

                case "size":
                    sb.append(q.size()).append('\n');
                    break;

                case "empty":
                    if(q.isEmpty()) {
                        sb.append(1).append('\n');
                    }
                    else {
                        sb.append(0).append('\n');
                    }
                    break;

                case "front":
                    Integer i = q.peek();
                    if(i == null) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(i).append('\n');
                    }
                    break;

                case "back":
                    Integer j = q.peekLast();
                    if(j == null) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(j).append('\n');
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
