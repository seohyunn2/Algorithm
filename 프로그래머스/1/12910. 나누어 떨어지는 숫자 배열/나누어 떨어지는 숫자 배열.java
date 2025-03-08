import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                res.add(arr[i]);
            }
        }
        if(res.isEmpty()) {
            res.add(-1);
        }
        int[] ans = new int[res.size()];
        for(int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        Arrays.sort(ans);
        return ans;
    }
}