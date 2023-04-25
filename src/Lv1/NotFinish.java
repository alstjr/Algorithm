package Lv1;
// 프로그래머스 완주하지못한선수

import java.util.Arrays;

public class NotFinish {
    public String solution(String[] participant, String[] completion) {
        // 배열을 이용한 코드
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i=0; i<completion.length; i++){

            if (participant[i].equals(completion[i])){
                continue;
            }else return participant[i];

        }
        return participant[participant.length - 1];
    }
    // 해시맵을 이용한 코드
//    String answer = "";
//    HashMap<String, Integer> hm = new HashMap<>();
//        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
//        for (String player : completion) hm.put(player, hm.get(player) - 1);
//
//        for (String key : hm.keySet()) {
//        if (hm.get(key) != 0){
//            answer = key;
//        }
//    }
//        return answer;
}