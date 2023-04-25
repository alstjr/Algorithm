package Baekjoon;
//백준#2798 블랙잭

import java.util.*;

public class BlackJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];

        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }

        int result = search(A, N, M);
        System.out.println(result);

    }

    static int search(int[] arr, int N, int M){
        int result = 0;
        for (int i=0; i < N-2; i++) {
            for (int j=i+1; j< N-1; j++){
                for(int k=j+1; k<N; k++){
                    int temp = arr[i] + arr[j] + arr[k];

                    if (M == temp) return temp;
                    if (result < temp && temp < M) result = temp;
                }
            }
        }
        return result;
    }
}
