package Baekjoon;

import java.util.Scanner;

public class BOJ_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        String[] rep = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(String c : rep) {
            input = input.replace(c, "O");
        }
        System.out.println(input.length());
    }
}
