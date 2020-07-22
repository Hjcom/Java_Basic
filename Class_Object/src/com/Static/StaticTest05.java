package com.Static;
// 인스턴스 멤버변수와 정적 멤버변수의 메모리 할당 순서

public class StaticTest05 {
    int b = check(2);
    static int a = check(1);

    public static int check(int i){
        System.out.println("call " + i);
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("메인");
        StaticTest05 s2 = new StaticTest05();
    }

    static int c = check(3);
}
/*
    1. 정적 멤버 변수가 먼저 메모리 할당
    2. main 메서드가 실행
    3. 객체가 생성되면서 인스턴스 멤버변수가 메모리할당
 */