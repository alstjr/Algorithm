package Baekjoon;
// 백준#10773 제로

import java.util.*;

public class Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int sum = 0;
        int top = -1;
        int[] array = new int[k];
        for (int i=0; i<k; i++){
            int number = sc.nextInt();
            if (number == 0){
                top--;
            }else {
                top++;
                array[top] = number;
            }
        }
        for (int i = 0; i <= top; i++) {	// 합을 구할 때 K가 아닌 top까지다.
            sum += array[i];
        }
        System.out.println(sum);
    }
}
