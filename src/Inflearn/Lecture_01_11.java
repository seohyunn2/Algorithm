package Inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Lecture_01_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();

        char[] input = line.toCharArray();
        int N = input.length;

        Stack<Character> res = new Stack<>();

        res.push(input[0]);
        int cnt = 1;
        for(int i = 1; i < N; i++) {
            if(i == N - 1) {
                if((input[i] == res.peek())) {
                    cnt++;
                    res.push((char)(cnt+'0'));
                } else {
                    res.push((char)(cnt+'0'));
                    res.push(input[i]);
                }
            } else {
                if (input[i] == res.peek()) {
                    cnt++;
                } else {
                    if (cnt != 1) {
//                        cnt++;
                        res.push((char) (cnt + '0'));
                        res.push(input[i]);
                        cnt = 1;
                    } else {
                        res.push(input[i]);
                    }
                }
            }
        }

        for(int i = 0; i < res.size(); i++) {
            System.out.printf("%c", res.get(i));
        }
    }
}
