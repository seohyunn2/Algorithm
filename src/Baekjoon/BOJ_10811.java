package Baekjoon;

import java.util.Scanner;

public class BOJ_10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = i;
        }
        for(int i = 0; i < m; i++) {
            int s = sc.nextInt() - 1;
            int f = sc.nextInt() - 1;
            System.out.println("s : "+s+" f: "+f );
            if(s != f) {
                for(int j = s; j <= f; j++, f--) {
                    arr[j] = f;
                }
                for(int k = 0; k < n; k++) {
                    System.out.printf("%d ", arr[i]+1);
                }
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]+1);
        }
    }
}
