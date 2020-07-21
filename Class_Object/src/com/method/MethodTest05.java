package com.method;
// 레퍼런스 변수만 선언하기
class MyDate_05{        // 클래스의 초기값 지정
    int year=2006;
    int month = 4;
    int day = 1;
}

public class MethodTest05 {
    public static void main(String[] args) {
        MyDate_05 d;    // 레퍼런스 변수 선언
        // System.out.println(d.year + "/" + d.month + "/" + d.day);
        // 레퍼런스 변수에 객체를 지정해야 사용가능

        // new MyDate_05(); // 객체 생성은 되었지만 사용 불가능

        d = new MyDate_05();    // 반드시 레퍼런스 변수에 객체 생성한 걸 대입해야함

        System.out.println(d.year + "/" + d.month + "/" + d.day);

    }
}
