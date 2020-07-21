package com.constructor;
// 디폴트 생성자 부재로 인한 에러 발생
class MyDate_E{
    private int year;
    private int month;
    private int day;

    // 전달인자가 있는 생성자 정의 , 디폴드 생성자 제공X
    public MyDate_E(int new_year, int new_month, int new_day){
        year = new_year;
        month = new_month;
        day = new_day;
    }
    public void print(){
        System.out.println(year + "/" + month + "/" + day);
    }
}
public class ConstructorTest05 {
    public static void main(String[] args) {
        // MyDate_E d = new MyDate_E();    // 디폴트 생성자 미제공으로 컴파일 에러가 생기므로 주석처리
        // d.print();

        MyDate_E d2 = new MyDate_E(2007, 7, 19);
        d2.print();
    }
}
