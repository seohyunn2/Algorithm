package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum = a+b;
            bw.write(sum+"\n");
        }
        bw.flush();
        bw.close();
    }
}
