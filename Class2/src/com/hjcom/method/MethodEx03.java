package com.hjcom.method;
// 절대값을 구하여 되돌려 받는 메서드 만들기

public class MethodEx03 {
    static int abs (int data){
        if (data<0)
            data = -data;
        return data;
    }

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);        // 콘솔로 값 전달
        System.out.println(" absolute data => " + abs(num));
    }
}
