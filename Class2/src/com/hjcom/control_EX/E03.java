package com.hjcom.control_EX;
// 2단부터 9단까지 구구단 출력하기

public class E03 {
    public static void main(String[] args) {
        int dan;        // 단을 결정하는 변수 선언
        int n;

        for (dan=2; dan<=9; dan++){     // 2단 ~ 9단 출력
            System.out.println("** " + dan + " 단 **");

            for(n=1; n<=9; n++){
                System.out.println(dan + " * " + n + " = " + dan * n);
            }
        }
    }
}
