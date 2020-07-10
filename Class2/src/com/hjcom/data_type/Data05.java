package com.hjcom.data_type;

// 암시적인 형변환과 명시적인 형변환
public class Data05 {
    public static void main(String[] args){
        byte a=1;
        short b=128;
        int c=32768;

        b=a;    // 암시적인 형변환
        System.out.println(b);

        b=(short)c;     // 명시적인 형변환

        System.out.println(b);  // 오버플로우가 발생되어 엉뚱한 값 출력
    }
}
