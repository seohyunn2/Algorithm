import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder(); // 출력 최적화를 위한 StringBuilder

        for(int i = 0; i < n; i++) {
            int k = sc.nextInt();
            switch(k) {
                case 1:
                    stack.push(sc.nextInt());
                    break;
                case 2:
                    if(stack.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(stack.pop()).append("\n");
                    }
                    break;
                case 3:
                    sb.append(stack.size()).append("\n");
                    break;
                case 4:
                    sb.append(stack.isEmpty() ? "1\n" : "0\n");
                    break;
                case 5:
                    if(stack.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(stack.peek()).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb); // 한 번만 출력하여 성능 개선
    }
}