import java.util.*;
class Solution {
	public static int[] solution(int[] array, int[][] commands) { 
		int[] ans = new int[commands.length]; 
		int n = 0;
		
		for (int i = 0; i < commands.length; i++) {                                    
			int[] list = new int[commands[i][1] - commands[i][0] + 1]; 
            
            int k = 0;
            
			for (int j = commands[i][0]; j <= commands[i][1]; j++) { // i~j
				list[k] = array[j - 1]; 
                k++;
			}
			Arrays.sort(list); 
			ans[n] = list[commands[i][2] - 1]; 
            n++;
		}
		return ans;
	}
}