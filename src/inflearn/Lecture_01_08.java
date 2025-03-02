package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Lecture_01_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String line = in.readLine();
        char[] input = line.toCharArray();
//        char[] reverse = new char[N];
        List<Character> alpha = new ArrayList<>();
        List<Character> reverse = new ArrayList<>();

        // 알파벳만 집어넣기
        for(int i = 0; i < input.length; i++) {
            if(('A'<=input[i]&&input[i]<='Z')||('a'<=input[i]&&input[i]<='z')) {
                input[i] = Character.toLowerCase(input[i]);
                alpha.add(input[i]);
            }
        }

        int N = alpha.size();
        // 리스트 뒤집기
        for(int i = 0; i < N; i++) {
            reverse.add(alpha.get(N - 1 - i ));
        }



        for(int i = 0; i < N; i++) {
            if(alpha.get(i) != reverse.get(i)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");



    }
}
