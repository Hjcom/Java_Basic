package com.hjcom.array;
// 2차원 배열에 초기값을 지정한 후 합 구하기

import javax.sound.midi.Soundbank;

public class Arr04 {
    public static void main(String[] args) {
        // 학생들의 과목별 점수를 저장한 2차원 배열 선언
        int [][] score = {
                { 85, 60, 70 },      // 0 행
                { 90, 95, 80 },      // 1 행
                { 75, 80, 100},      // 2 행
                { 80, 70, 95 },      // 3 행
                {100, 65, 80 }       // 4 행
        };
        int [] subject = new int[3];    // 각 과목별 총점을 저장할 변수 선언
        int [] student = new int[5];    // 각 학생별 총점을 저장할 변수 선언

        int r, c;

        System.out.println("각 과목별 총점구하기 ");
        for (c = 0; c < 3; c++){
            for (r = 0; r < 5; r++)
                subject[c] += score[r][c];
            System.out.println(subject[c]);
        }

        System.out.println("학생별 총점구하기");
        for (r = 0; r < 5; r++){
            for (c =0; c < 3; c++)
                student[r] += score[r][c];
            System.out.println(student[r]);
        }
    }
}
