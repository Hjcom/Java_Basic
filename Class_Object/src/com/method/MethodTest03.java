package com.method;
// 전달인자의 개수가 다른 메서드 오버로딩

public class MethodTest03 {
    // 정수형 데이터 3개를 형식 매개변수로 갖는 prn 메서드 정의
    void prn(int a, int b, int c){
        System.out.println(a + "\t" + b + "\t" + c);
    }

    // 정수형 데이터 2개를 형식 매개변수로 갖는 prn 메서드 정의
    void prn(int a, int b){
        System.out.println(a + "\t" + b);
    }

    // 정수형 데이터 1개를 형식 매개변수로 갖는 prn 메서드 정의
    void prn(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        MethodTest03 mt = new MethodTest03();

        mt.prn(10, 20, 30);
        mt.prn(40, 50);
        mt.prn(60);
    }
}
