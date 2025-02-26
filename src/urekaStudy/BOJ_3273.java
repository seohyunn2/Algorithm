package urekaStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_3273 {
    static int n, x;
    static int[] a;
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        a = new int[n];
        st = new StringTokenizer(in.readLine(), " ");
        for(int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(in.readLine(), " ");
        x = Integer.parseInt(st.nextToken());

        Arrays.sort(a);
        int left = 0;
        int right = n-1;

        while(left < right) {
            int sum = a[left] + a[right];
            if(sum == x) {
//                System.out.printf("[cnt++] left: %d, right: %d  ==> sum: %d\n", left, right, sum);
                cnt++;
                left++;
                right--;
            } else if(sum > x) {
                right--;
            } else {
                left++;
            }
        }
        System.out.println(cnt);
    }
}
