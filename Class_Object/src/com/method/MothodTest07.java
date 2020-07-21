package com.method;
// 기본 자료형과 레퍼런스 형의 차이점

class MyDate_07{
    int year = 2006;
    int month = 4;
    int day = 1;
}

public class MothodTest07 {
    public static void main(String[] args) {
        // MyDate_07형 레퍼변수 선언, 객체 생성
        MyDate_07 d = new MyDate_07();
        MyDate_07 t = d; // t가 이미 선언된 d와 동일한 객체를 참조

        System.out.println(d.year+ "/" +d.month + "/" + d.day);     // 2006/4/1
        System.out.println(t.year+ "/" +t.month + "/" + t.day);     // 2006/4/1

        t = new MyDate_07();    // t가 새로 생성된 객체를 가리키므로 d와는 별개로 동작
        t.year=2007;
        t.month=7;
        t.day=19;

        System.out.println(d.year+ "/" +d.month + "/" + d.day);     // 2006/4/1
        System.out.println(t.year+ "/" +t.month + "/" + t.day);     // 2007/7/19

    }
}
