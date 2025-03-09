package Baekjoon;

import java.util.Scanner;

public class BOJ_10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 바구니 개수
        int m = sc.nextInt(); // 명령문 개수

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        for(int i = 0; i < m; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            int a = arr[A-1];
            int b = arr[B-1];

            arr[A-1] = b;
            arr[B-1] = a;
        }
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < n;i++) {
            s.append(arr[i]);
            s.append(" ");
        }
        System.out.println(s);
    }
}
