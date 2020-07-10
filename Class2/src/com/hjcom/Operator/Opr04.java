package com.hjcom.Operator;

// 10대인지 아닌지 알아보기
public class Opr04 {    // 논리 연산자와 조건 연산자 활용하기
    public static void main(String[] args){
        int a=29;
        String s="몰라";

        s = (a>=10 && a<=19) ? "10대" : "10대 아님" ;
        System.out.println(a + " => " + s);
    }
}
