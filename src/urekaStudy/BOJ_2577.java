package urekaStudy;

import java.util.Scanner;

public class BOJ_2577 {
    static int A, B, C, mul;
    static int[] count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        mul = A * B * C;
        count = new int[10];
        while(mul != 0) {
            count[mul%10]++;
            mul /= 10;
        }
        for(int i = 0; i < 10; i ++) {
            System.out.println(count[i]);
        }
    }
}
