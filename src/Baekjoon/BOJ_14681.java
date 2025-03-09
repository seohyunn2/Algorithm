package Baekjoon;

import java.util.Scanner;

public class BOJ_14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = -1;
        if(x > 0) {
            if (y > 0) {
                ans = 1;
            } else {
                ans = 4;
            }
        } else if(x < 0) {
            if(y > 0) {
                ans = 2;
            } else {
                ans = 3;
            }
        }
        System.out.println(ans);
    }
}
