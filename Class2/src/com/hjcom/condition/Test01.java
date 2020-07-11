package com.hjcom.condition;
// main 메서드의 인자 살피기
public class Test01 {
    public static void main(String[] args) {
        System.out.println("입력받은 문자열의 개수="+args.length);

        for(int i=0; i<args.length; i++)    // 명령행에서 입력받은 문자열을 출력
            System.out.println("args["+ i + "]=" + args[i]);
    }
}
