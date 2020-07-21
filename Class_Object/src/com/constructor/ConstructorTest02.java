package com.constructor;

// 생성자 정의와 호출
class MyDate_B{
    private int year;
    private int month;
    private int day;

    // 생성자가 호출되는지 확인하기 위해 메시지 추가
    public MyDate_B(){
       year = 2006;
       month = 4;
       day = 1;
    }
    public void print(){
        System.out.println(year + "/" + month + "/" + day);
    }
}
public class ConstructorTest02 {
    public static void main(String[] args) {
        MyDate_B d = new MyDate_B();    // 생성자가 호출되는 시점
        d.print();
    }
}
