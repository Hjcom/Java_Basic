package com.hjcom.condition;
// switch문에 break 문의 역할 살피기
public class Switch02 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);

        System.out.println("=> " + a);

        switch (a){
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }
    }
}
