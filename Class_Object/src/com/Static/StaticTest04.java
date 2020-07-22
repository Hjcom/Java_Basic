package com.Static;
// 정적 메서드에서 인스턴스 멤버변수 사용 불가능

class StaticTest_04{
    private static int a = 10;
    private int b = 20;

    public static void printA(){
        // 정적 메서드에서는 인스턴스 멤버변수를 사용하지 못함
        System.out.println(a);
        // System.out.println(b); (X)
    }

    public void printB(){
        System.out.println(this.b);
    }
}

public class StaticTest04 {
    public static void main(String[] args) {
        StaticTest_04.printA();
        StaticTest_04 s1 = new StaticTest_04();
        StaticTest_04 s2 = new StaticTest_04();

        s1.printB();
        s2.printB();
    }
}
/*
    정적 메서드에서 인스턴스 멤버변수 b를 사용하면 this로 접근할 수 없기 때문에
    어떤 인스턴스 소속인지 구분할 수가 없게 된다
    그러므로 사용할 수가 없는 것이다.
 */
