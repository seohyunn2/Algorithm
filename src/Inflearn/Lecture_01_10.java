package Inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Lecture_01_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");

        char[] input = st.nextToken().toCharArray();
        char target = st.nextToken().charAt(0);
        // target 알파벳의 인덱스 저장해둠
        List<Integer> where = new ArrayList<>();
        int[] ans = new int[input.length];

        for(int i = 0; i < input.length; i++) {
            if(input[i] ==  target) {
                where.add(i);
            }
        }
//        int minDis = Integer.MAX_VALUE;
        for(int i = 0; i < input.length; i++) {
            if(input[i] == target) {
                ans[i] = 0;
            } else {
                int minDis = Integer.MAX_VALUE;
                for(int j = 0; j < where.size(); j++) {
                    int dis = Math.abs(where.get(j) - i);
                    if(dis < minDis) {
                        minDis = dis;
                    }
                    ans[i] = minDis;
                }

            }
        }
        for(int i = 0; i < input.length; i++) {
            System.out.printf("%d ", ans[i]);
        }
    }
}
