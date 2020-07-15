package com.hjcom.break_continue;
// while문을 이용한 무한 루프
// while(true) : 일반적인 무한 루프 표현법

public class F04 {
    public static void main(String[] args) {
        int n=0;

        while(true){
            System.out.println("Fall Wonderland");
            if (++n >= 10)
                break;
        }
        System.out.println("The End ");
    }
}
