package Programmers;

import java.util.*;

public class PROG_68644 {
    public static int[] solution(int[] numbers) {
        Set<Integer> result = new HashSet<>(); // 중복 허용하지 않는 HashSet 사용
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                result.add(numbers[i] + numbers[j]);
            }
        }
        List<Integer> resultList = new ArrayList<>(result);
        Collections.sort(resultList);
        int[] answer = new int[resultList.size()];
        for(int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] test1 = {2, 1, 3, 4, 1};
        int[] test2 = {5, 0, 2, 7};

        System.out.println("Test 1 result: " + Arrays.toString(solution(test1)));
        System.out.println("Test 2 result: " + Arrays.toString(solution(test2)));
    }
}
