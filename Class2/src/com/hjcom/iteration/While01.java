package com.hjcom.iteration;
// 1부터 5 사이의 자연수 출력하기

public class While01 {
    public static void main(String[] args) {
        int i;

        for (i=1; i<=5; i++)
            System.out.print(" " + i);

        System.out.print("\n");
        for (i=1; i<=25; i++)
            System.out.print("-");
        System.out.print("\n");

        i=1;            // 초기식
        while(i<=5){    // 조건식
            System.out.print(" "+ i);   // 반복 처리할 문장
            i++;        // 증감식
        }
    }
}
