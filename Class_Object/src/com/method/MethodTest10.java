package com.method;
// null 값을 갖는 레퍼런스형 변수
// 예외처리 사용
class MyDate_10{
    int year = 2006;
    int month = 4;
    int day = 1;
}

public class MethodTest10 {
    public static void main(String[] args) {
        MyDate_10 d = null;

        try {
            System.out.println(d.year + "/" + d.month + "/" + d.day);
        }catch (Exception e){
            System.out.println("예외 발생");
        }
        System.out.println("정상 종료");
    }
}
