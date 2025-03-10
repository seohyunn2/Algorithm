package Baekjoon;

import java.util.Scanner;

public class BOJ_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] input = sc.next().toCharArray();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum+=input[i]-'0';
        }
        System.out.println(sum);
    }
}
