package com.method;
// 메서드의 오버로딩의 예 (println() : 전달인자의 자료형을 다르게 하여 오버로딩한 예

public class MethodTest01 {
    public static void main(String[] args) {
        // (1) 논리값 : true, false
        System.out.println(true);
        // (2) 문자 : 단일 따옴표로 묶어줌
        System.out.println('A');
        // (3) 정수: 소수점이 없는 수
        System.out.println(128);
        // (4) 실수 : 소수점이 있는 수
        System.out.println(3.5);
        // (5) 문자열 : 이중 따옴표로 묶어줌
        System.out.println("Hello");
    }
}
