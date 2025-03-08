package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lecture_01_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());

        char[][] input = new char[N][];


        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            input[i] = st.nextToken().toCharArray();
        }

        for(int i = 0; i < N; i++) {
            for(int j = input[i].length - 1; j >=0; j--) {
                System.out.printf("%c", input[i][j]);
            }
            System.out.println();
        }
    }
}
