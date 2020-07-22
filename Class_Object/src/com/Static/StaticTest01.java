package com.Static;
// 정적 멤버변수와 인스턴스 맴버변수의 차이점

class StaticTest_01{
    static int a = 10;
    int b = 20;
}

public class StaticTest01 {
    public static void main(String[] args) {
        System.out.println("StaticTest.a -> " + StaticTest_01.a);
        StaticTest_01 s1 = new StaticTest_01();
        StaticTest_01 s2 = new StaticTest_01();

        System.out.println("s1.a -> " + s1.a + "\t s2.a -> "+ s2.a);
        System.out.println("s1.b -> " + s1.b + "\t s2.b -> "+ s2.b);

        s1.a=100;
        System.out.print("s1.a -> " + s1.a);
        System.out.println("\t s2.a -> " + s2.a);

        s1.b=200;
        System.out.print("s1.b -> " + s1.b);
        System.out.println("\t s2.b -> " + s2.b);
    }
}
