package com.hjcom.condition;
// 두 정수 중에서 최대값, 최소값을 구하기
public class If03 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);      // a=5
        int b = Integer.parseInt(args[1]);      // b=10
        int max, min;       // 최대값, 최소값을 저장할 변수 선언

        if (a > b){
            max = a;
            min = b;
        }
        else{
            max = b;
            min = a;
        }

        System.out.println("최대값은 " + max + "입니다");
        System.out.println("최소값은 " + min + "입니다");
    }
}
