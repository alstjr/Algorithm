package Lv2;
// 프로그래머스 올바른 괄호

public class Bracket {
    boolean solution(String s){
        int OpenBCount = 0; // 열은 괄호 카운트
        int CloseBCount = 0; // 닫은 괄호 카운트

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == '('){
                OpenBCount++;
            } else if (s.charAt(i) == ')') {
                CloseBCount++;
            }
            if (OpenBCount < CloseBCount) {
                return false;
            }
        }
        if (OpenBCount == CloseBCount){
            return true;
        }
        return false;

    }
}
