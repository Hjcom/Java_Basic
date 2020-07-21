package com.constructor;
// 전달인자를 갖는 생성자 정의 - 생성자 오버로딩 예제
class MyDate_C{
    private int year;
    private int month;
    private int day;

    // 1) 생성자는 속성(맴버변수)들의 초기화 작업을 목적으로 한다.
    public MyDate_C(){
        year = 2006;
        month = 4;
        day = 1;
    }
    // 2) 전달인자 있는 생성자 정의 - 오버로딩
    public MyDate_C(int new_year, int new_month, int new_day){
        year = new_year;
        month = new_month;
        day = new_day;
    }
    public void print(){
        System.out.println(year + "/" + month + "/" + day);
    }
}

public class ConstructorTest03 {
    public static void main(String[] args) {
        MyDate_C d = new MyDate_C();    // 전달인자 없는 생성자 호출
        d.print();

        // 전달인자 있는 생성자 호출
        MyDate_C d2 = new MyDate_C(2007, 7, 19);
        d2.print();
    }
}
