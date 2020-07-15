package com.hjcom.break_continue;
// break문의 사용

public class F02 {
    public static void main(String[] args) {
        int i;
        int a;

        for (a=1; a<10; a++){
            for (i=1; i<=10; i++){
                if (i%3==0)
                    break;
                System.out.print(" i -> " + i);
            }
            System.out.println("\n a -> " + a);
        }
        for (i=1; i<=25; i++)
            System.out.print("-");
        System.out.println("\n");

        // 이중 for문을 벗어나기 위해 레이블을 사용
        exit_for:
            for (a=1; a<10; a++){
                for (i=1; i<=10; i++){
                    if (i%3==0)
                        break exit_for;
                    System.out.print(" i -> " + i);
                }
                System.out.println("\n a -> " + a);
            }

        System.out.println();
        for (i=1; i<=25; i++)
            System.out.print("-");
    }
}
