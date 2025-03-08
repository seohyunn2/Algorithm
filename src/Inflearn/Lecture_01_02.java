package Inflearn;

import java.util.*;

public class Lecture_01_02 {
    static String enter;
    static char[] arr;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        enter = sc.nextLine();
        arr = enter.toCharArray();

        for(int i = 0; i < enter.length(); i++) {
            if('A'<=arr[i] && arr[i] <='Z') {
                arr[i] = Character.toLowerCase(arr[i]);
            } else {
                arr[i] = Character.toUpperCase(arr[i]);
            }
            System.out.print(arr[i]);
        }

    }
}
