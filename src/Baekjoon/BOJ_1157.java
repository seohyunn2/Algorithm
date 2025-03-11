package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        char[] input = in.readLine().toUpperCase().toCharArray();
        int[] alpha = new int[26];
        for(int i = 0; i < input.length; i++) {
            alpha[(int)(input[i]) - 65]++;
        }

        int max = Integer.MIN_VALUE;
        char idx = 'a';
        for(int i = 0; i < 26; i++) {
            if(alpha[i] > max) {
                max = alpha[i];
                idx = (char)(i+65);
            }
        }
        int cnt = 0;
        for(int i = 0; i < 26; i++) {
            if(alpha[i] == max) {
                cnt++;
            }
        }
        if (cnt > 1) {
            System.out.println("?");
        } else {
            System.out.println(idx);
        }
    }
}