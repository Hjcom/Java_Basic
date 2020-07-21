package com.constructor;
// 속성(맴버변수) 앞에 레퍼런스 this 붙이기
class MyDate_G{
    private int year;
    private int month;
    private int day;

    // 생성자 정의
    public MyDate_G(){
    }
    // 생성자 역시 매개변수의 이름을 속성과 동일하게 줄 수 있다.
    public MyDate_G(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    // 대입연산자 왼쪽에 있는 year와 대입연산자 오른쪽에 있는 year 모두 전달인자로 인식하므로 속성값 변경X
    public void SetYear(int year){
        this.year = year;
    }
    public void SetMonth(int month){
        this.month = month;
    }
    public void print(){
        System.out.println(year + "/" + month + "/" + day);
    }
}
public class ConstructorTest07 {
    public static void main(String[] args) {
        MyDate_G d = new MyDate_G(2007, 7, 19);
        d.print();

        d.SetYear(2008);
        d.SetMonth(8);
        d.print();
    }
}


