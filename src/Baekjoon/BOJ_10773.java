package Baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++) {
            int k = sc.nextInt();
            if(k == 0) {
                stack.pop();
            } else {
                stack.push(k);
            }
        }
//        System.out.println(stack);
        int sum = 0;
        if(stack.isEmpty()) {
            System.out.println(0);
        } else {
            int s = stack.size();
            for(int i = 0; i < s; i++) {
                sum += stack.pop();
            }
            System.out.println(sum);
        }
    }
}
