package Baekjoon;

import java.util.Scanner;

public class BOJ_2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int res = 0;
        if(y%4==0) {
            if(y%100 != 0 || y%400 == 0) {
                res = 1;
            }
        }
        System.out.println(res);

    }
}
