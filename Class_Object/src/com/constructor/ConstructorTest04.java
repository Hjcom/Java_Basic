package com.constructor;
// java가 제공해주는 디폴트 생성자
class MyDate_D{
    private int year;
    private int month;
    private int day;

    public void print(){
        System.out.println(year + "/" + month + "/" + day);
    }
}
public class ConstructorTest04 {
    public static void main(String[] args) {
        MyDate_D d = new MyDate_D();    // 디폴트 생성자 호출 0/0/0
        d.print();
    }
}
