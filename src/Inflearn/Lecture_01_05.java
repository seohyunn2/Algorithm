package inflearn;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Lecture_01_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();

        char[] input = line.toCharArray();
        int N = input.length;
        Stack<Character> alpha = new Stack<>();
//        char[][] noAlpha = new char[N][];
        List<Integer> noAlpha = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            if((input[i] >= 'A' && input[i] <= 'Z') || (input[i] >= 'a' && input[i] <= 'z')) {
                alpha.push(input[i]);
            } else {
                noAlpha.add(i);
            }
        }

        for(int i = 0; i < noAlpha.size(); i++) {
            if(i == 0) {
                for(int j = 0; j < noAlpha.get(0); j++) {
                    System.out.printf("%c", alpha.pop());
                }
            } else {
                for(int j = 0; j < noAlpha.get(i) - noAlpha.get(i - 1) - 1; j++) {
                    System.out.printf("%c", alpha.pop());
                }
            }
            if(i==noAlpha.size()-1) {
                System.out.printf("%c", input[noAlpha.get(i)]);
                break;
            }
            System.out.printf("%c", input[noAlpha.get(i)]);
        }
        while(!alpha.isEmpty()) {
            System.out.printf("%c", alpha.pop());
        }

    }
}
