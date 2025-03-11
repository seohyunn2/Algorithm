package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        char[] input = in.readLine().toUpperCase().toCharArray();
        int[] alpha = new int[26];
        for(int i = 0; i < input.length; i++) {
            alpha[(int)(input[i]) - 65]++;
        }


    }
}