package com.hjcom.iteration;
// 2단 출력하기
public class For04 {
    public static void main(String[] args) {
        int i;      // 제어변수 선언
        int a=2;    // 출력할 단을 저장하는 변수 선언, 2단 출력

        System.out.println("<<-----" + a + "단----->>");

        for(i=1; i<=9; i++)
            System.out.println(a + " * " + i + " = " + (a * i));
    }
}
