package com.hjcom.iteration;
// 입력받은 단 출력하기
public class For04_1 {
    public static void main(String[] args) {
        int i, n=0;
        // 출력하고자하는 단으로 명령행에서 5를 입력받는다고 가정
        int a = Integer.parseInt(args[0]);

        System.out.println("<<-----" + a + "단----->> ");
        for(i=1; i<=9; i++){
            n=a*i;
            System.out.println(a + " * "+ i + " = "+ n);
        }
    }
}
