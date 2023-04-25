package Lv2;
// 프로그래머스 최솟값 만들기

import java.util.Arrays;

public class Minimum {
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0;i<A.length;i++) {

            answer=answer+(A[i]*B[A.length-i-1]);

        }
        return answer;
    }
}