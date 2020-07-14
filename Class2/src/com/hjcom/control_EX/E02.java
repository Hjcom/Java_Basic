package com.hjcom.control_EX;
// 다중 for문에서 제어변수의 변화 알아보기

public class E02 {
    public static void main(String[] args) {
        int i;
        int a;

        System.out.println("시침 ---------->> 분침");
        System.out.println("a(바깥 쪽 제어변수) -->> i(안 쪽 제어변수)");

        for (a=1; a<5; a++)
            for (i=1; i<=5; i++)
                System.out.println(a + " ---------->> " + i);
    }
}
