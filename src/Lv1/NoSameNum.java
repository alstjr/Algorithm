package Lv1;
// 프로그래머스 같은 숫자는 싫어

import java.util.*;

public class NoSameNum {
    public int[] solution(int[] arr){
        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int num = -1;
        for (int i=0; i<arr.length; i++){
            if(arr[i] != num) {
                arrayList.add(arr[i]);
                num = arr[i];
            }
        }
        answer = new int[arrayList.size()];
        for (int i=0; i<answer.length; i++){
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}
