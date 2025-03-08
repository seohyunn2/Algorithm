package Inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.List;

public class Lecture_01_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");

        List<String> input = new ArrayList<>();
        while(st.hasMoreTokens()) {
            input.add(st.nextToken());
        }
        int max = Integer.MIN_VALUE;
        int maxIdx = -1;
        for(int i = 0; i < input.size(); i++) {
            if(max < input.get(i).length()) {
                max = input.get(i).length();
                maxIdx = i;
            }
        }
        System.out.println(input.get(maxIdx));
    }
}
