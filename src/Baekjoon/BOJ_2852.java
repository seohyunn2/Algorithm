package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2852 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int goal; // 골 넣은 시간
        int score = 0; // 점수차 (0: 동점, +: 1, -: 2)
        int time = 0; // 이전 득점 시간
        int team1 = 0;
        int team2 = 0; // 누적 시간
        boolean check; // 1팀골: true, 2팀골: false

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            if(st.nextToken().equals("1")){
                check = true;
            }
            else {
                check = false;
            }
            String str = st.nextToken();
            // 초로 변환
            goal = (str.charAt(0) - '0') * 600; // 십분자리
            goal += (str.charAt(1) - '0') * 60; // 분자리
            goal += (str.charAt(3) - '0') * 10; // 십초자리
            goal += str.charAt(4) - '0'; // 초자리
            if(score > 0){ // 팀 1 이기고 있으면
                team1 += goal - time;
            }
            if(score < 0){ // 팀 2 이기고 있으면
                team2 += goal - time;
            }
            if(check){ // 1 이기고 있으면
                score +=1;
            }
            else { // 2 이기고 있으면
                score -=1;
            }
            time = goal;
        }
        if(score > 0) {
            team1 += 2880 - time; // 1이 이기고있으면 남은 시간 1한테
        }
        if(score < 0) { // 2가 "
            team2 += 2880 - time;
        }

        System.out.printf("%02d:%02d", team1 / 60, team1 % 60);
        System.out.println();
        System.out.printf("%02d:%02d", team2 / 60, team2 % 60);
    }
}
