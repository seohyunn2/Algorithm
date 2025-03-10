package Baekjoon;

import java.util.Scanner;

public class BOJ_5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] input = sc.next().toCharArray();
        int sum = input.length;
        for(int i = 0; i < input.length; i++) {
            sum+=getNum(input[i]);
        }
        System.out.println(sum);


    }
    public static int getNum(char c) {
        if(c == 'A' || c == 'B' || c == 'C') {
            return 2;
        }
        if(c == 'D' || c == 'E' || c == 'F') {
            return 3;
        }
        if(c == 'G' || c == 'H' || c == 'I') {
            return 4;
        }
        if(c == 'J' || c == 'K' || c == 'L') {
            return 5;
        }
        if(c == 'M' || c == 'N' || c == 'O') {
            return 6;
        }
        if(c == 'P' || c == 'Q' || c == 'R' || c == 'S') {
            return 7;
        }
        if(c == 'T' || c == 'U' || c == 'V') {
            return 8;
        }
        if(c == 'X' || c == 'Y' || c == 'W' || c == 'Z') {
            return 9;
        }
        else return 0;
    }
}
