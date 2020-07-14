package com.hjcom.control_EX;
// 스타(*)로 사각형 출력하기

public class E04 {
    public static void main(String[] args) {
        int a;      // 행
        int b;      // 열

        for (a=1; a<=5; a++){
            for (b=1; b<=5; b++){
                System.out.print("* ");
            }
            System.out.println(); // 줄바꿈 문장
        }
    }
}
