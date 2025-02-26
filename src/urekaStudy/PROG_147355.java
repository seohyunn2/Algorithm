package urekaStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PROG_147355 {
    public static int solution(String t, String p) {
        int answer = 0;
        long target = Long.parseLong(p); // 비교할 숫자

        // p의 길이 구하기
        int len = p.length();
        System.out.println("len : " + len);
        char[] tArray = t.toCharArray();
        int left = 0;
//        int right = left + len - 1;

        while(left < tArray.length - len + 1) {
                double sum = 0;
                for (int i = left, k = 1; i < left + len; i++, k++) {
                    sum += ((tArray[i]-'0') * Math.pow(10, len - k));
//                    System.out.println("k: "+k);
//                    System.out.println(tArray[i]);
//                    System.out.println(Math.pow(10, len-k));
//                    System.out.println(left + " -> " + sum);
                }
                if (sum <= target) {
                    answer++;
//                    System.out.printf("[answer++] left: %d\n", left);
                }
                left++;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");

        String T, P;
        T = st.nextToken();
        st = new StringTokenizer(in.readLine(), " ");
        P = st.nextToken();

        int res = solution(T, P);
        System.out.println(res);
    }
}
