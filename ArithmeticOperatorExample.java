public class ArithmeticOperatorExample {// #산술 연산자#
    public static void main(String[] args) {
        int v1 = 5;
        int v2 = 2;

        int result1 = v1 + v2;
        System.out.println("result1=" + result1);

        int result2 = v1 - v2;
        System.out.println("result2=" + result2);

        int result3 = v1 * v2;
        System.out.println("result3=" + result3);

        int result4 = v1 / v2;  //  v1 / v2 v2를 v1으로 나눈 값
        System.out.println("result4=" + result4);
  
        int result5 = v1 % v2;  //  v1 % v2 v2를 v1으로 나누고 남은 나머지값 
        System.out.println("result5=" + result5);

        double result6 = (double) v1 / v2;
        System.out.println("result6=" + result6);

    
    }
    
}