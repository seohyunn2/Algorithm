package Baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
* 여는 괄호 -> push => 닫는 괄호 -> 여는 괄호 pop
* */
public class BOJ_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < N ; i++) {
            String str = br.readLine();

            for (int j = 0; j < str.length() ; j++) {
                if(str.charAt(j) == '('){
                    stack.push(str.charAt(j));
                }else{
                    if(stack.isEmpty()){
                        stack.push(str.charAt(j)); // 스택이 비어있는지 여부로 yes, no 판단할거니까 넣어주고 break
                        break;
                    }
                    stack.pop();
                }
            }
            if(stack.isEmpty()) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            stack.clear();
        }
    }
}
