import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 킹1, 퀸1, 룩2, 비숍2, 나이트2, 폰8
        int[] card = {1, 1, 2, 2, 2, 8};
        int[] input = new int[6];
        for(int i = 0; i < 6; i++) {
            input[i] = sc.nextInt();
        }
        for(int i = 0; i < 6; i++) {
            int ans = card[i] - input[i];
            System.out.print(ans+" ");
        }
    }
}