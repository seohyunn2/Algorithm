package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Lecture_01_09 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();

        char[] input = line.toCharArray();
        List<Character> numbers = new ArrayList<>();

        for(int i = 0; i < input.length; i++) {
            if(input[i] >= '0' && input[i] <= '9') {
                numbers.add(input[i]);
            }
        }

        String str = "";
        for(int i = 0; i < numbers.size(); i++) {
            str += numbers.get(i);
        }
        int ans = Integer.parseInt(str);
        System.out.println(ans);

    }
}
