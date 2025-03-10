package Baekjoon;

import java.util.Scanner;

public class BOJ_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            char[] input = sc.next().toCharArray();
            System.out.print(input[0]);
            System.out.print(input[input.length-1]);
            System.out.println();
        }
    }
}
