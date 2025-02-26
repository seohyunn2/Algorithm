package urekaStudy;

import java.util.Scanner;

public class BOJ_1475 {
    static int input, max, maxIdx, six, nine;
    static int[] num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        input = sc.nextInt();
        num = new int[10];
        while (input != 0) {
            num[input % 10]++;
            input /= 10;
        }
        six = 0;
        nine = 0;
        max = Integer.MIN_VALUE;
        maxIdx = -1;
        for (int i = 0; i < 10; i++) {
            if (i == 6) {
                six = num[i];
            } else if (i == 9) {
                nine = num[i];
            } else {
                if (max < num[i]) {
                    max = num[i];
                    maxIdx = i;
                }
            }

            int sum = six + nine;
            if (sum % 2 == 0) {
                sum /= 2;
            } else {
                sum = sum / 2 + 1;
            }
            if (max > sum) System.out.println(max);
            else System.out.println(sum);
        }

    }
}
