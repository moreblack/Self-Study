public class StringEqualsExample {//#문자열 비교#
    public static void main(String[] args) {
        String strVar1 = "신민철";
        String strVar2 = "신민철";
        String strVar3 = new String("신민철");

        System.out.println( strVar1 == strVar2);
        System.out.println( strVar1 == strVar3);
        System.out.println();
        System.out.println( strVar1.equals(strVar2));
        System.out.println( strVar1.equals(strVar3));
           
        // == 두 연산자값이 같은지 검사
        // != 두 연산자값이 다른지 검사
        // >= 크거나 같은지
        // <  작은지
        // >  큰지
        // <= 작거나 같은지

    }
    
}