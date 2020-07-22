package com.Static;
// 정적 메서드에서 this 사용 불가능

class StaticTest_03{
    private static int a = 10;
    private int b = 20;

    public static void printA(){
        // 정적 메서드에서는 this를 사용하지 못함
        System.out.println(a);
        // System.out.println(this.a); (X)
    }

    public void printB(){
        // this는 인스턴스 매서드에서 여러 객체에 의해서
        // 메서드가 호출될 때 이를 구분하기 위해서 사용
        System.out.println(this.b);
    }
}

public class StaticTest03 {
    public static void main(String[] args) {
        StaticTest_03.printA();
        StaticTest_03 s1 = new StaticTest_03();
        StaticTest_03 s2 = new StaticTest_03();

        s1.printB();
        s2.printB();
    }
}
/*
    정적 메서드는 해당 클래스로 선언된 모든 객체에 의해 공유되기 때문에 객체를 구분X
    클래스 단위로 호출되므로 특정 객체의 주소도 없다.
    그리고 정적 멤버변수는 클래스 단위로 접근 가능한 멤버이므로
    this가 필요없다(인스턴스를 구분할 필요도 없다)
 */