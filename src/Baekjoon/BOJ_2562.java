package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int[] arrCopy = new int[9];
        for(int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            arrCopy[i] = arr[i];
        }


        Arrays.sort(arrCopy);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arrCopy));

        int max = arrCopy[8];
//        System.out.print("max : "+max+"\n");
        int idx = -1;
        for(int i = 0; i < 9; i++) {
            if(arr[i] == max) {
                idx = i;
                break;
            }
        }
        System.out.println(max);
        System.out.println(idx+1);
    }
}
