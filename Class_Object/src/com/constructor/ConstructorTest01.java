package com.constructor;
// 생성자 정의하기
class MyDate_A{
    private int year;
    private int month;
    private int day;

    // 생성자가 호출되는지 확인하기 위해 메시지 추가
    public MyDate_A(){
        System.out.println("[생성자] : 객체가 생성될 때 자동 호출됩니다.");
    }
    public void print(){
        System.out.println(year + "/" + month + "/" + day);
    }
}
public class ConstructorTest01 {
    public static void main(String[] args) {
        MyDate_A d = new MyDate_A();    // 생성자가 호출되는 시점
        d.print();
    }
}
