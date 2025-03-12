package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int[] visited = new int[26]; // 지금 방문 중인 알파벳은 101, 다음 알파벳으로 넘어갈 때에는 이전 알파벳을 1로 바꿔줌.

        for(int i = 0; i < n; i++) {
            boolean group = true;
            char[] word = sc.next().toCharArray();
            boolean[] alpha = new boolean[26];


        }
    }
}
