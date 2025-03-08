package Inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Lecture_01_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();

        char[] input = line.toCharArray();
        List<Character> ans = new ArrayList<>();
        ans.add(input[0]);
        for(int i = 0; i < input.length; i++) {
            int cnt = 0;
            for(int j = 0; j < ans.size(); j++) {
                if(ans.get(j) != input[i]) {
                    cnt++;
                }
                if(cnt == ans.size()) {
                    ans.add(input[i]);
                }
            }
        }
        for(int i = 0; i < ans.size(); i++) {
            System.out.printf("%c", ans.get(i));
        }

    }
}
