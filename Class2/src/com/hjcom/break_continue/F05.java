package com.hjcom.break_continue;
// for문을 이용한 무한 루프
// for( ; ; ) = for문의 일반적인 무한 루프 표현

public class F05 {
    public static void main(String[] args) {
        int n=0;

        for( ; ; ){
            System.out.println("Fall Wonderland");
            if (++n >= 10)
                break;
        }
        System.out.println("The End ");
    }
}
