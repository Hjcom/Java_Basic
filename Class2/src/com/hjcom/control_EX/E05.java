package com.hjcom.control_EX;
// 숫자를 삼각형 형태로 출력하기

public class E05 {
    public static void main(String[] args) {
        int line;       // 라인수
        int spc;        // 공백
        int n;          // 숫자수
        int number=1;   // 출력할 숫자
        int size=3;     // 반복 제어변수

        for (line=1; line <= size; line++){
            for(spc=size-line; spc >= 1; spc--) // 공백을 출력할 횟수
                System.out.print(" ");
            for(n=1; n <= line*2-1; n++)        // 숫자를 출력할 횟수
                System.out.print(number++);
            System.out.println();       // 줄바꿈
        }

    }
}
