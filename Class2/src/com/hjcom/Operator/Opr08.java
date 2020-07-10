package com.hjcom.Operator;

// 증감 연산자의 선행처리와 후행처리
public class Opr08 {    // 대입 연산자와 증감 연산자
    public static void main(String[] args){
        int a=10, b=10;

        System.out.println(++a);    // 선행처리 값 = 11
        System.out.println(a);      // 11

        System.out.println(b++);    // 후행처리 값 = 10
        System.out.println(b);      // 11

        a=b=10;
        int c;

        c = ++a;
        System.out.println(c + " => " + a);     // 11 => 11

        c= b++;
        System.out.println(c + " => " + b);     // 10 => 11

    }
}
