// 절대값 구하기
package com.hjcom.condition;

public class If01 {
    public static void main(String[] args) {
        int num;

        num = -5;
        if (num < 0)
            num = -num;
        System.out.println(" absolute num = " + num);

        num = 5;
        if (num < 0)
            num = -num;
        System.out.println(" absolute num = " + num);
    }
}
