package Baekjoon;

import java.util.Scanner;

public class BOJ_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int first = m % 10;
        System.out.println(n * first);
        int second = ((m % 100) - first) / 10;
        System.out.println(n * second);
        int third = (m - first - second*10) / 100;
        System.out.println(n * third);

        System.out.println(n * m);
    }
}
