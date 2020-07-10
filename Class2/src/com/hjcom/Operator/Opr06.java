package com.hjcom.Operator;

// 대문자인지 아닌지를 판단하기 (아스키 코드값 비교)
public class Opr06 {
    public static void main(String[] args){
        char ch='b';    // 문자 변수 선언
        String s;       // 대문자인지 판단한 결과를 저장할 문자열 변수 선언

        s = (ch>='A' && ch<='Z') ? "대문자임" : "대문자가 아님" ;
        System.out.println(ch + " => " + s);
    }
}
