package Baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BOJ_10845 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Deque<Integer> q = new ArrayDeque<>();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < n; i++) {
            String s = sc.next();
            switch(s) {
                case "push":
                    q.offer(sc.nextInt());
                    break;
                case "pop":
                    if(q.isEmpty()) {
                        bw.write("-1");
                    } else {
                        bw.write(String.valueOf(q.poll()));
                    }
                    bw.write("\n");
                    break;
                case "size":
                    bw.write(String.valueOf(q.size()) + "\n");
                    break;
                case "empty":
                    if (q.isEmpty()) {
                        bw.write("1");
                    } else {
                        bw.write("0");
                    }
                    bw.write("\n");
                    break;
                case "front":
                    if (q.isEmpty()) {
                        bw.write("-1");
                    } else {
                        bw.write(String.valueOf(q.peekFirst()));
                    }
                    bw.write("\n");
                    break;
                case "back":
                    if (q.isEmpty()) {
                        bw.write("-1");
                    } else {
                        bw.write(String.valueOf(q.peekLast()));
                    }
                    bw.write("\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
