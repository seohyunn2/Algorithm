package Baekjoon;

import java.util.Scanner;

public class BOJ_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int r = sc.nextInt();
            char[] line = sc.next().toCharArray();

            getAns(r, line);
        }
    }
    public static void getAns(int r, char[] input) {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < input.length; i++) {
            for(int j = 0; j < r; j++) {
                str.append(input[i]);
            }
        }
        System.out.println(str);
    }
}
