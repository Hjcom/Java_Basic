package com.class_object;
// public 메서드 정의
class Animal03{
    String name;
    private int age;

    public void setAge(int new_age){        // age 속성 수정
        age = new_age;
    }

    public int getAge(){        // age 가져오기
        return age;
    }
}

public class AnimalTest03 {
    public static void main(String[] args) {
        Animal03 a;
        a = new Animal03();
        a.name = "원숭이";
        // a.age = 26; // private이므로 삭제
        a.setAge(26);

        System.out.print(a.name);
        // System.out.print(", " + a.age);      // private이므로 사용 불가
        System.out.print(", " + a.getAge());
    }
}
