package urekaStudy;
import java.util.Scanner;
public class BOJ_1475 {
    static int input, max, maxIdx, six, nine;
    static int[] num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        input = sc.nextInt();
        num = new int[10];
        while(input != 0) {
            num[input%10]++;
            input /= 10;
        }
        six = 0;
        nine = 0;
        max = Integer.MIN_VALUE;
        maxIdx = -1;
        for(int i = 0; i < 10; i++) {
            if(i == 6) {
                six = num[i];
            } else if(i==9) {
                nine = num[i];
            } else {
                if(max < num[i]) {
                    max = num[i];
                    maxIdx = i;
                }
            }
//             System.out.printf("update max : %d     max_idx = %d\n six = %d, nine = %d\n", max, maxIdx, six, nine);
        }
        // 풀이 1 -> 오답
        // max가 6, 9보다 큰 경우 -> 그대로 출력
        // max가 6이나 9보다 작은 경우 -> 6, 9 값 더해서 나누기 2 (짝수면 그대로, 홀수면 +1 해서 출력)

//        if(max > six && max > nine) {
//            System.out.println(max);
//        } else {
//            int sum = six + nine;
//            if(sum % 2 == 0) {
//                System.out.println(sum/2);
//            } else {
//                System.out.println(sum/2 + 1);
//            }
//        }

        int sum = six + nine;
        if(sum %2 == 0) {
            sum /= 2;
        } else {
            sum = sum / 2 + 1;
        }
        if(max > sum) System.out.println(max);
        else System.out.println(sum);
    }


}