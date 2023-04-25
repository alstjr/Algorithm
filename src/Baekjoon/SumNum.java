package Baekjoon;
// 백준#11720 숫자의 합

import java.util.*;

public class SumNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String M = sc.next();

        sc.close();
        int sum = 0;
        for (int i=0; i<N; i++){
            sum += M.charAt(i) -'0';
        }
        System.out.println(sum);
    }
}
