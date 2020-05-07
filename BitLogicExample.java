public class BitLogicExample {
    public static void main(String[] args) {
        System.out.println("45 & 25 =" + (45 & 25)); //비트 연산자 두비트 모두 1일경우에 1
        System.out.println("45 | 25 =" + (45 | 25)); //비트 연산자 두비트중 하나만 1이면 1
        System.out.println("45 ^ 25 =" + (45 ^ 25)); //비트 연산자 두비트중 하나 1이고 다른하나가 0일경우
        System.out.println("~45 =" + (~45));        // 비트 연산자 반대방향
    }
    
}