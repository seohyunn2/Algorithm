package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2755 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());

//        int[] count = new int[N]; // 학점
//        double[] score = new double[N];

        int cnt = 0; // 학점 계산
        double score = 0; // 점수 계산

        for(int i = 0; i < N; i++) {
            int count = 0;
//            String input = in.readLine();
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");

            st.nextToken();
            count = Integer.parseInt(st.nextToken());
            cnt+=count;

            score += grade(st.nextToken()) * count;
        }
        System.out.printf(("%.2f%n"), (score/cnt));
    }
    public static double grade(String str) {
        char[] input = str.toCharArray();
        double score;
        if (input[0] == 'A') {
            score = 4.0;
//            if (input[1] == '+') {
//                score += 0.3;
//            } else if (input[1] == '-') {
//                score -= 0.3;
//            }
        } else if (input[0] == 'B') {
            score = 3.0;
//            if (input[1] == '+') {
//                score += 0.3;
//            } else if (input[1] == '-') {
//                score -= 0.3;
//            }
        } else if (input[0] == 'C') {
            score = 2.0;
//            if (input[1] == '+') {
//                score += 0.3;
//            } else if (input[1] == '-') {
//                score -= 0.3;
//            }
        } else if (input[0] == 'D') {
            score = 1.0;
//            if (input[1] == '+') {
//                score += 0.3;
//            } else if (input[1] == '-') {
//                score -= 0.3;
//            }
        } else {
            score = 0.0;
        }
        if (input[1] == '+') {
            score += 0.3;
        } else if (input[1] == '-') {
            score -= 0.3;
        }
        return score;
    }
}
