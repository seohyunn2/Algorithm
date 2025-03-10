package Baekjoon;


import java.util.Scanner;

public class BOJ_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder a = new StringBuilder(sc.next());
        StringBuilder b = new StringBuilder(sc.next());
//        System.out.println(a);
//        System.out.println(b);

        a.reverse();
        b.reverse();
//        System.out.println(a);
//        System.out.println(b);
        int inta = Integer.parseInt(a.toString());
        int intb = Integer.parseInt(b.toString());
//        System.out.println(inta);
//        System.out.println(intb);

        int max = Math.max(inta, intb);
        System.out.println(max);
    }
}
