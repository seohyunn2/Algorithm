import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < m; i++) {
            int s = sc.nextInt() - 1;
            int f = sc.nextInt() - 1;
            int ball = sc.nextInt();

            for(int j = s; j <= f; j++) {
                arr[j] = ball;
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}