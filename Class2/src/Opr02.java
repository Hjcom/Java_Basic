// 수치 데이터의 대소 관계 살피기
public class Opr02 {    // 관계연산자
    public static void main(String[] args){
        int a=10, b=4, c;
        boolean test;

        test = a>b;
        System.out.println(a + " > " + b + " = " + test);

        test = a<b;
        System.out.println(a + " < " + b + " = " + test);

        // 두 산술연산자 결과에 대한 대소 관계를 물어볼 수도 있다.
        System.out.println(a+b > a-b);
    }
}
