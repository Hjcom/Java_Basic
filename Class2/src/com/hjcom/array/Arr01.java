package com.hjcom.array;
// 총점과 평균 구하기

public class Arr01 {
    public static void main(String[] args) {
        int []score = {95, 70, 80, 75, 100};        // 5명 학생의 점수 초기값
        int total = 0;                              // 점수 총합 저장 변수
        double ave;                                 // 점수 평균 저장 변수

        // 반복문으로 배열을 일괄 처리함
        for (int i=0; i<5; i++)
            total += score[i];      // 총합 연산

        ave = (double) total / 5.0; // 평균 연산

        System.out.println(" Total = " + total);       // 총합 출력
        System.out.println(" Ave = " + ave);           // 평균 출력
    }
}
