package com.method;
// 레퍼런스에 의한 호출 방식 (Pass by Reference)

class MyDate_09{
    int year = 2006;
    int month = 4;
    int day = 1;
}
class RefMethod{
    void changeDate(MyDate_09 t){
        t.year=2007;
        t.month=7;
        t.day=19;
    }
}
public class MothodTest09 {
    public static void main(String[] args) {
        // changeDate 메서드를 호출하기 위해 RefMethod 객체 생성
        RefMethod rm = new RefMethod();
        // changeDate 메서드의 전달인자로 사용하기 위해서 MyDate_09 객체 생성
        MyDate_09 d = new MyDate_09();

        System.out.println("함수 호출 전 d->" + d.year + "/" + d.month + "/" + d.day);

        // rm으로 RefMothod 클래스의 changeDate 메서드를 호출
        rm.changeDate(d);
        System.out.println("함수 호출 후 d->" + d.year + "/" + d.month + "/" + d.day);

    }
}
