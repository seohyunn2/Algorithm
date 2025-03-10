import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] input = sc.next().toCharArray();
        int[] alpha = new int[26]; // 알파벳 개수 저장
        for(int i = 0; i < 26; i++) {
            alpha[i] = -1;
        }

        for(int i = 0; i < input.length; i++) {
            int k = (int)(input[i]) - 97;
            if(alpha[k] == -1) {
                alpha[k] = i;
            }

        }
//        System.out.println(Arrays.toString(alpha));
        for(int i = 0; i < 26; i++) {
            System.out.print(alpha[i] + " ");
        }

    }
}