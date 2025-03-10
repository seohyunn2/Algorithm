import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();

        if(line.equals(" ")) {
            System.out.println(0);
            return;
        }
        char[] input = line.toCharArray();
//        System.out.println(Arrays.toString(input));
        int s = -1, f = -1;
        // 첫 번째 글자와 마지막 글자의 인덱스 찾아서 그 사이만 돌기?
        for(int i = 0; i < input.length; i++) {
           if(input[i] != ' ') {
               s = i;
               break;
           }
        }
        for(int i = input.length - 1; i > 0; i--) {
            if(input[i] != ' ') {
                f = i;
                break;
            }
        }
        int cnt = 0;
        for(int i = s; i <= f; i++) {
            if(input[i] == ' ') cnt++;
        }
        System.out.println(cnt + 1);
    }
}