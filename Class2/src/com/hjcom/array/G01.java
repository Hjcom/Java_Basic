package com.hjcom.array;
// 1차원의 배열에 값 지정과 출력 방법

public class G01 {
    public static void main(String[] args) {
        int[] score = new int[5];     // 5명의 점수(정수)를 저장하기 위한 배열 선언

        // 배열의 엘리먼트트(요소, 원소)에 접근하여 점수를 저장
        score[0] = 95;
        score[1] = 70;
        score[2] = 80;
        score[3] = 75;
        score[4] = 100;

        // 반복문으로 배열을 일괄 처리함
        for (int i = 0; i < 5; i++)
            System.out.println((i + 1) + " th score[ " + i + " ] = " + score[i]);
    }
}

