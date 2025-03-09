package Baekjoon;

import java.util.Scanner;

public class BOJ_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int cook = sc.nextInt();

        int addh, addm, resh, resm;

        addh = cook / 60;
        addm = cook % 60;

        resh = h + addh;
        resm = m + addm;

        if(resm >= 60) {
            resh += resm/60;
            resm %= 60;
        }
        if(resh>=24) {
            resh -= 24;
        }
        System.out.printf("%d %d", resh, resm);
    }
}
