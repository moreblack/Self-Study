public class Calculator3Example {//#정적 멤버 사용#
    public static void main(String[] args) {
        double result1 = 10 * 10 * Calculator3.pi; //Calculator3의 파이를 호출
        int result2 =  Calculator3.plus(10,5);  //Calculator3 plus 값을 호출
        int result3 =  Calculator3.minus(10,5); //Calculator3의 minus 값을 호출

        System.out.println("result1:" + result1);
        System.out.println("result2:" + result2);
        System.out.println("result3:" + result3);
    }
    
}