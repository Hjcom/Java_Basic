package com.hjcom.condition;
// 양수인지 음수인 0인지 판별하기
public class If04 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);  // a=5;

        if (a>0)
            System.out.println(a+ "는 양수입니다.");
        else if(a<0)
            System.out.println(a+ "는 음수입니다.");
        else
            System.out.println("0 입니다.");
    }
}
