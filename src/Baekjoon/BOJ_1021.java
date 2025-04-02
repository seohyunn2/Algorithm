package Baekjoon;

import java.util.LinkedList;
import java.util.Scanner;

public class BOJ_1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> deque = new LinkedList<Integer>();

        int cnt = 0;

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            deque.offer(i);
        }

        int[] arr = new int[m];	//  뽑으려는 수

        for(int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }


        for(int i = 0; i < m; i++) {

            // 덱에서 뽑으려는 숫자의 인덱스 찾기
            int target = deque.indexOf(arr[i]);
            int half;

            // 짝수개면 인덱스 -1
            if(deque.size() % 2 == 0) {
                half = deque.size() / 2 - 1;
            }
            else {
                half = deque.size() / 2;
            }


            // 중앙보다 앞에 있을 때
            if(target <= half) {
                // 앞에서 뽑아서 뒤로 보내
                for(int j = 0; j < target; j++) {
                    int temp = deque.pollFirst();
                    deque.offerLast(temp);
                    cnt++;
                }
            }
            else {	// 중앙보다 뒤에 있을 때
                //  뒤에서 뽑아서 앞으로 보내
                for(int j = 0; j < deque.size() - target; j++) {
                    int temp = deque.pollLast();
                    deque.offerFirst(temp);
                    cnt++;
                }

            }
            deque.pollFirst();
        }

        System.out.println(cnt);

    }
}
