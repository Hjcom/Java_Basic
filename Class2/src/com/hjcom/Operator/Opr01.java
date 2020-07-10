package com.hjcom.Operator;

// 수치 데이터로 사칙연산하기
public class Opr01 {
    public static void main(String[] args){
        int a=10, b=4, c;
        c = a+b;
        System.out.println(a + " + "+ b + " = " + c);
        c = a-b;
        System.out.println(a + " - "+ b + " = " + c);
        c = a*b;
        System.out.println(a + " * "+ b + " = " + c);
        c = a/b;
        System.out.println(a + " / "+ b + " = " + c);
        c = a%b;
        System.out.println(a + " % "+ b +  " = "+ c);
    }
}
