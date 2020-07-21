package com.class_object;

public class AnimalTest01 {
    // 클래스 정의와 객체 생성 후 사용하기
    public static void main(String[] args) {
        Animal a;       // 레퍼런스 변수 선언
        a = new Animal();   // 객체 생성

        a.name = "원숭이";     // 생성된 객체의 맴버에 저장된 값 출력
        a.age = 26;

        System.out.print(a.name);
        System.out.print(", " + a.age);

    }
    // 이름과 나이를 속성으로 갖는 Animal 클래스에 설계
}

class Animal{
    String name;
    int age;
}
