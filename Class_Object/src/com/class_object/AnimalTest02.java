package com.class_object;
// private 속성 선언
// private : 해당 객체 내부에 정의한 매서드에서만 접근 가능 / 외부 객체 접근 불가

public class AnimalTest02 {
    public static void main(String[] args) {
        Animal02 a;
        a = new Animal02();

        a.name = "원숭이";
        a.age = 26;         // private 맴버이므로 접근 불가능

        System.out.print(a.name);
        System.out.print(", " + a.age);     // 출력 불가능, 에러
    }
}

class Animal02{
    String name;
    private int age;
}
