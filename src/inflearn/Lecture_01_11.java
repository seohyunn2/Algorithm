package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Lecture_01_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();
        char[] input = line.toCharArray();

        List<Character> res = new ArrayList<>();
        int cnt = 1;
        for(int i = 0; i < input.length; i++) {
            if(i == 0) {
                res.add(input[i]);
            } else {
                if(input[i] == input[i-1]) {
                    cnt++;
                } else {
                    if(cnt>1) {
//                        System.out.println(cnt);
                        res.add((char) (cnt + '0'));
                        cnt = 1;
                    } else {
                        res.add(input[i]);
                    }
                }
            }
        }
        for(int i = 0; i < res.size(); i++) {
            System.out.printf("%c", res.get(i));
        }
    }
}
