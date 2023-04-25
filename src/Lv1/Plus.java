package Lv1;
// 프로그래머스 두 수 뽑아서 더하기

import java.util.*;

public class Plus {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i=0; i<numbers.length; i++){
            for (int j=i+1; j<numbers.length; j++){
                int a = numbers[i]+numbers[j];
                if (list.indexOf(a) <0 ){
                    list.add(a);
                }
            }
        }
        int[] answer = new int[list.size()];
        for (int i=0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}

