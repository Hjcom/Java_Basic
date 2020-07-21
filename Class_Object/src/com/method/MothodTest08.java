package com.method;
// 값에 의한 호출 방식 예제 (Pass by Value)
class ValueMethod{
    void changeInt(int y) {
        y = 10;
    }
}

public class MothodTest08 {
    public static void main(String[] args) {
        // changeInt 메서드를 호출하기 위해서 객체 생성
        ValueMethod vm = new ValueMethod();
        int x = 7;

        System.out.println("함수 호출 전 x->" + x);

        vm.changeInt(x);
        System.out.println("함수 호출 후 x->" + x);
    }
}
