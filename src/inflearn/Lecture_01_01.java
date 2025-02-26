package inflearn;

import java.util.Scanner;

public class Lecture_01_01 {
    static String enter, find;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        enter = sc.nextLine();
        find = sc.nextLine();

        enter = enter.toLowerCase();
        find = find.toLowerCase();

        int cnt = 0;

        for(int i = 0; i < enter.length(); i++) {
            if(enter.charAt(i) == find.charAt(0)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}