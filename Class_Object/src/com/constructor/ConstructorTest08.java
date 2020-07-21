package com.constructor;
// this로 생성자 호출
class MyDate_H{
    private int year;
    private int month;
    private int day;

    public MyDate_H(){
        this(2006, 1, 1);
    }
    public MyDate_H(int new_year){
        this(new_year, 1, 1);
    }
    public MyDate_H(int new_year, int new_month){
        this(new_year, new_month, 1);
    }
    public MyDate_H(int new_year, int new_month, int new_day){
        year = new_year;
        month = new_month;
        day = new_day;
    }
    public void print(){
        System.out.println(year + "/" + month + "/" + day);
    }
}
public class ConstructorTest08 {
    public static void main(String[] args) {
        MyDate_H d = new MyDate_H(2007, 7, 19);
        d.print();

        MyDate_H d2 = new MyDate_H(2007, 7);
        d2.print();

        MyDate_H d3 = new MyDate_H(2007);
        d3.print();

        MyDate_H d4 = new MyDate_H();
        d4.print();
    }
}


