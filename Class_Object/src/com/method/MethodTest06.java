package com.method;
// 기본 자료형과 레퍼런스 형의 차이점

class MyDate_06{
    int year = 2006;
    int month = 4;
    int day = 1;
}

public class MethodTest06 {
    public static void main(String[] args) {
        // int형 변수 선언
        int x = 7;
        int y=x;        // 변수 x 값 대입

        // MyDate_06형 레퍼변수 선언
        MyDate_06 d = new MyDate_06();
        MyDate_06 t = d;

        System.out.println("x->" + x + " y->"+y);
        System.out.println(d.year+ "/" +d.month + "/" + d.day);     // 2006/4/1
        System.out.println(t.year+ "/" +t.month + "/" + t.day);     // 2006/4/1

        y = 10;         // x의 값에 영향을 주진 않음
        System.out.println("x->" + x + " y->"+y);

        t.year=2007;
        t.month=7;
        t.day=19;

        // 레퍼런스 d로 접근했을 때에도 변경되어진 값이 출력
        System.out.println(d.year+ "/" +d.month + "/" + d.day);     // 2007/7/19
        System.out.println(t.year+ "/" +t.month + "/" + t.day);     // 2007/7/19



    }
}
