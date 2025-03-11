package Baekjoon;

import java.util.Scanner;

public class BOJ_2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i < n; i++) {
            for(int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for(int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < 2*n-1; i++) {
            System.out.print("*");
        }
        System.out.println();
        for(int i = n - 1; i > 0; i--) {
            for(int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for(int k = 2 * i - 1; k > 0; k--) {
                System.out.print("*");
            }
            if(i != 1) {
                System.out.println();
            }
        }
    }
}
