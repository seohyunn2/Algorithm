package Baekjoon;

import java.util.Scanner;

public class BOJ_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] isExist = new boolean[42];
        for(int i = 0; i < 10; i++) {
            isExist[sc.nextInt() % 42] = true;
        }
        int cnt = 0;
        for(int i = 0; i < 42; i++) {
            if(isExist[i]) cnt++;
        }
        System.out.println(cnt);
    }
}
