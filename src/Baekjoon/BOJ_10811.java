package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class BOJ_10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        Stack<Integer> rev = new Stack<>();
        for(int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        for(int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int f = sc.nextInt();
            if(s != f) {
                for(int j = s; j <= f; j++) {
                    rev.push(arr[j - 1]);
                }
                for(int k = s - 1; k <= f - 1; k++) {
                    arr[k] = rev.pop();
                }
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
