package Programmers;

public class PROG_12919 {
    public String solution(String[] seoul) {
        String answer = "";
        int res = -1;
        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                res = i;
                break;
            }
        }
        answer = String.format("김서방은 %d에 있다.", res) ;
        return answer;
    }
}
