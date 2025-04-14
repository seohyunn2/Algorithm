package Programmers;

public class PROG_81301 {
    public static int solution(String s) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        for(int i = 0; i < words.length; i++) {
            s = s.replaceAll(words[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
    public static void main(String[] args) {
        String[] testCases = {
                "one4seveneight",
                "23four5six7",
                "2three45sixseven",
                "123"
        };

        for (String testCase : testCases) {
            int result = solution(testCase);
            System.out.println("입력: " + testCase + " → 출력: " + result);
        }
    }
}
