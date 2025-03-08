package Inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lecture_01_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();

        char[] input = line.toCharArray();
        int N = input.length;
        char[] reverse = new char[N];

        for(int i = 0; i < N; i++) {
            input[i] = Character.toLowerCase(input[i]);
            reverse[i] = Character.toLowerCase(input[N - i - 1]);
        }

        String str1 = String.valueOf(input);
//        System.out.printf("str1: %s\n", str1);
        String str2 = String.valueOf(reverse);
//        System.out.printf("str2: %s\n", str2);

        if(str1.equals(str2)) System.out.println("YES");
        else System.out.println("NO");
    }
}
