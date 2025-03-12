package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        double cal = 0;
        double cnt = 0;
        for(int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            st.nextToken();
//            cal += Double.parseDouble(st.nextToken()) * getScore(st.nextToken());
            double time = Double.parseDouble(st.nextToken());
            String score = st.nextToken();
            if(!score.equals("P")) {
                cal += time * getScore(score);
                cnt += time;
            }
        }
        System.out.println(cal/cnt);
    }
    public static double getScore(String str) {
        switch(str) {
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            case "F":
                return 0;
        }
        return 0;
    }
}
