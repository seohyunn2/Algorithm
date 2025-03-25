package Baekjoon;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class BOJ_1747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        if(N == 1) {
            System.out.println(2);
        } else {
            for (int i = N; ; i++) {
                if (checkP(i) && isPrime(i)) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }

    public static boolean checkP(int n) {
        String s = Integer.toString(n);
        char[] c = s.toCharArray();
        int len = c.length;
        for(int i = 0; i < len; i++) {
            if(c[i] != c[len-i-1]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime(int k) {
        for(int i = 2; i <= (int)Math.sqrt(k); i++) {
            if(k % i == 0) {
                return false;
            }
        }
        return true;
    }
}
