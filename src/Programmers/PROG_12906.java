package Programmers;

import java.util.*;

public class PROG_12906 {
//    public List<Integer> solution(int []arr) {
////        int[] answer = {};
//        List<Integer> answer = new ArrayList<>();
//        int read = arr[0];
//        answer.add(arr[0]);
//
//        for(int i = 0; i < arr.length; i++) {
//            if(read != arr[i]) {
//                read = arr[i];
//                answer.add(arr[i]);
//            }
//        }
//        return answer;
//    }

    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        stack.push(arr[0]);

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != stack.peek()) {
                stack.push(arr[i]);
            }
        }
        int[] stackPop = new int[stack.size()];
//        for(int i = answer.length; i > 0; i--) {
//            answer[answer.length - 1] = stack.pop();
//        }

        for(int i = 0; i < stackPop.length; i++) {
            stackPop[i] = stack.pop();
        }

        int[] answer = new int[stackPop.length];

        for(int i = 0; i < stackPop.length; i++) {
            answer[i] = stackPop[stackPop.length - i - 1];
        }

        return answer;
    }
}