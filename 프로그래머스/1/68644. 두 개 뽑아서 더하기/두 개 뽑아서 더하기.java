import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
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
}