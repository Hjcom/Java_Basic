package com.method;
// Varargs를 이용하여 다양한 형태로 메서드 호출하기
// Varargs : 필요에 따라 매개변수를 가변적으로 조정할 수 있는 기능

public class MethodTest04 {
    void prn (int ... num){
        for (int i=0; i<num.length; i++)    // 전달인자 개수만큼 반복
            System.out.print(num[i] + "\t");
        System.out.println();
    }

    public static void main(String[] args) {
        MethodTest04 mt = new MethodTest04();

        mt.prn(10, 20, 30);     // 개수에 상관없이 메서드 호출가능
        mt.prn(50, 60);
        mt.prn(60);
    }
}
