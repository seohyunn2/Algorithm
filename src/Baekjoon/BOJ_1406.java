package Baekjoon;

import java.io.*;
import java.util.*;

public class BOJ_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String line = in.readLine();

        // 링크드리스트에 입력받은 문자 집어넣기
        LinkedList<Character> ll = new LinkedList<>();
        for(int i = 0; i < line.length();i++) {
            ll.add(line.charAt(i));
        }
        // 위 반복문을 이렇게 써도 될듯
//        ListIterator<Character> cursor = ll.listIterator(ll.size());

        ListIterator<Character> iter = ll.listIterator();
        // 명령어 개수 입력받기
//        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        int n = Integer.parseInt(in.readLine());

        // 커서를 맨 뒤로 이동시켜주기 (문제 조건)
        while(iter.hasNext()) {
            iter.next();
        }

        // 명령어 입력받고 처리하기
        for(int i = 0; i < n; i++) {
//            st = new StringTokenizer(in.readLine(), " ");
//            char k = st.nextToken().charAt(0);
            String input = in.readLine();

            char k = input.charAt(0);
            switch(k) {
                case 'L':
                    if(iter.hasPrevious()) {
                        iter.previous();
                    }
                    break;
                case 'D':
                    if(iter.hasNext()) {
                        iter.next();
                    }
                    break;
                case 'B':
                    if(iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                    break;
                case 'P':
                    char c = input.charAt(2);
                    iter.add(c);
                    break;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder s = new StringBuilder();
//        for(int i = 0; i < ll.size(); i++) {
//            s.append(ll.get(i));
//        }
//        bw.write(s.toString());

//        for(int i = 0; i < ll.size(); i++) {
//            bw.write(ll.get(i));
//        }

        for(char f:ll) {
            bw.write(f);
        }

        bw.flush();
        bw.close();
    }
}
