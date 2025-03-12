package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i = 0; i < n; i++) {

            boolean group = true;
            char[] word = sc.next().toCharArray();
            int[] alpha = new int[26];
            for(int j = 1; j < word.length; j++) {
                if(j == 1) {
                    if(word[0] != word[1]) {
                        alpha[(int)(word[0]) - 97]++;
                    }
                } else if(j <= word.length - 1) {
                    if(word[j] != word[j-1]) {
                        alpha[(int)(word[j]) - 97]++;
                        alpha[(int)(word[j-1]) - 97]++;
                    }
                }
//                else if(j == word.length-1){
//                    if(word[j] != word[j - 1]) {
//                        alpha[(int)(word[j]) - 97]++;
//                    }
//                }
                System.out.println(Arrays.toString(alpha));

            }
            for(int k = 0; k < 26; k++) {
                if(alpha[k] > 1) {
                    group = false;
                }
            }
            if(group) {
                cnt++;
            }

            for(int a = 0; a < 26; a++) {
                alpha[a] = 0;
            }
        }
        System.out.println(cnt);
    }
}
