import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int groupCnt = 0;
        for(int i = 0; i < n; i++) {
            int[] visited = new int[26]; // 지금 방문 중인 알파벳은 2, 다음 알파벳으로 넘어갈 때에는 이전 알파벳을 1로 바꿔줌.
            boolean group = true;
            char[] word = sc.next().toCharArray();
            for(int j = 0; j < word.length; j++) {
                if(visited[(int)(word[j] - 'a')] == 1) {
                    group = false;
                }
                else {
                    if(j != word.length-1 && word[j+1] == word[j]) {
                        visited[(int)(word[j] - 'a')] = 2;
                    } else {
                        visited[(int)(word[j] - 'a')] = 1;
                    }
                }
            }
            if(group) {
//                System.out.println(word);
                groupCnt++;
            }

        }
        System.out.println(groupCnt);
    }
}