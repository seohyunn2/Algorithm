package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 받아야 할 순서(order) → 받고 빠지게
 * 받아야 할 순서 X → Stack 에서 대기하는 사람과 비교 → 그 사람도 순서 아니면 서브 스택에 push
 */


public class BOJ_12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");
        Stack<Integer> stack = new Stack<>();  // 메인 라인(원래는 큐로 하는게 자연스러움)
        Stack<Integer> temp = new Stack<>();  // 서브 라인(원래 스택이 기본)
        for(int i=N-1; i>=0; i--){
            stack.push(Integer.parseInt(inputs[i]));  // 스택 썼으니까 -> 역순으로 push
        }

        int order = 1;  // 현재 나가야 하는 번호 (얘랑 비교할거임)
        while(!stack.isEmpty()){  // 메인 통로가 빌 때까지 반복
            int target = stack.peek();  // 먼저 메인라인의 다음 사람의 번호를 가져옴

            if(target == order){  // 현재 나가야 하는 번호와 일치하면
                stack.pop();  // 바로 메인라인에서 빼고
                order++;  // 다음 번호로 업데이트
            } else{  // 나가야 하는 번호가 아니면 -> 서브라인 확인
                if(!temp.isEmpty()){
                    if(temp.peek() == order){  // 서브라인에서 나갈 수 있는 번호가 order와 같으면
                        temp.pop();  // 서브 라인에서 빼고
                        order++;  // order+1한다
                    }else{  // 서브라인에서 가져온 번호도 나가야 하는 번호가 아니면
                        temp.push(stack.pop());  // 메인라인의 번호를 서브 라인으로 일단 옮겨둠
                    }
                }else{  // 서브 라인이 비었으면
                    temp.push(stack.pop());  // 바로 서브 라인으로 옮김
                }
            }
        }

        // 메인라인은 내보낼 대로 내보냈으므로 서브 라인에서도 내보낸다.
        while(!temp.isEmpty()){  // 서브라인이 빌 때까지 반복
            if(temp.pop() == order){  // 서브라인에서 꺼낸 번호가 나가야 하는 번호이면
                order++;  // 다음 번호로 (pop을 조건부에서 이미 했음)
            }else{  // 만약 꺼낸 번호가 나가야하는 번호가 아니라면 그냥 끝이다. 다시 메인으로 못넣으니까
                break;
            }
        }

        if(stack.isEmpty() && temp.isEmpty()){
            sb.append("Nice");
        }else{
            sb.append("Sad");
        }

        System.out.println(sb);
        br.close();
    }
}
