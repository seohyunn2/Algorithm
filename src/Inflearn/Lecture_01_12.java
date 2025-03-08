package Inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lecture_01_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String line = in.readLine();
        String input = "";
//        String res = ""; // 결과 저장할 문자열
        StringBuilder res = new StringBuilder();
        int num;
        for(int i = 0; i < n; i++) {
//            String num2 = ""; // 2진수
            StringBuilder num2 = new StringBuilder();
            input = line.substring(i*7, i*7+7);
            for(int j = 0; j < 7; j++) {
                if(input.charAt(j) == '#') {
                    num2.append('1');
                } else{
                    num2.append('0');
                }
            }
            num = Integer.parseInt(num2.toString(), 2);
            res.append((char)(num));
        }
        System.out.println(res);
    }
}

