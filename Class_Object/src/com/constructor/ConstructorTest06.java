package com.constructor;
// this를 사용할 경우 : 맴버변수와 속성이 동일해서 생긴 문제점
class MyDate_F{
    private int year;
    private int month;
    private int day;

    // 생성자 정의
    public MyDate_F(){

    }
    public MyDate_F(int new_year, int new_month, int new_day){
        year = new_year;
        month = new_month;
        day = new_day;
    }
    // 대입연산자 왼쪽에 있는 year와 대입연산자 오른쪽에 있는 year 모두 전달인자로 인식하므로 속성값 변경X
    public void SetYear(int year){
        // this.year = year;
        year = year;
    }
    public void SetMonth(int new_month){
        month = new_month;
    }
    public void print(){
        System.out.println(year + "/" + month + "/" + day);
    }
}
public class ConstructorTest06 {
    public static void main(String[] args) {
        MyDate_F d = new MyDate_F(2007, 7, 19);
        d.print();

        d.SetYear(2008);       // 변경되지않음
        d.print();

        d.SetMonth(8);  // 변경됨
        d.print();
    }
}

