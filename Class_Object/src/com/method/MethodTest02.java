package com.method;
// 전달인자의 자료형이 다른 메서드 오버로딩
public class MethodTest02 {
    // int형 데이터에 대해서 절대값을 구하는 메서드 정의
    int abs(int num){
        if(num<0)
            num = -num;
        return num;
    }
    // long형 데이터에 대해서 절대값을 구하는 메서드 정의
    long abs(long num){
        if (num < 0)
            num = -num;
        return num;
    }

    // double 데이터에 대해서 절대값을 구하는 메서드 정의
    double abs (double num){
        if (num < 0)
            num = -num;
        return num;
    }

    public static void main(String[] args) {
        MethodTest02 mt = new MethodTest02();

        // int
        int var01 = -10, var02;
        var02 = mt.abs(var01);
        System.out.println(var01 + "의 절대값은-> " + var02);

        // long
        long var03 = -20L, var04;
        var04 = mt.abs(var03);
        System.out.println(var03 + "의 절대값은-> " + var04);

        // double
        double var05 = -3.4, var06;
        var06 = mt.abs(var05);
        System.out.println(var05 + "의 절대값은-> " + var06);
    }
}
