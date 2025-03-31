import java.util.Scanner;

/**
 * dp로 풀었음
 * 계단 n까지의 최고 점수 = 계단 n까지 오는 경우 중 최고 점수 + 계단 n의 점수
 * int[] dp : 1~n 각 계단에 대한 현재계단(n)까지의 최고 점수
 * int[] stair: 각 계단의 점수
 *
 * n번째 계단을 밟는 경우 -> n-1을 밟고 오는 경우(무조건 n-3을 밟고 와야됨)
 *                       or n-2를 밟고 오는 경우
 * 점화식: dp[n] = Math.max(dp[n-3] + stair[n-1], dp[n-2]) + stair[n]
 */


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] stair = new int[n+2];
        for(int i = 1; i <= n; i++) {
            stair[i] = sc.nextInt();
        }

        int[] dp = new int[n+2];
        dp[1] = stair[1];
        dp[2] = stair[1] + stair[2];

        for(int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i-3] + stair[i-1], dp[i-2]) + stair[i];
        }
        System.out.println(dp[n]);
    }
}