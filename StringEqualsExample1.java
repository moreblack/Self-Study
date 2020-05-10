public class StringEqualsExample1{//#문자열비교#
    public static void main(String[] args){

        String strVar1 ="신민철";   
        String strVar2 ="신민철";

        if(strVar1 == strVar2){
            System.out.println("strVar1 과 strVar2는 참조가 같다");  // == 참조 비교
        }else{
            System.out.println("strVar1 과 strVar2는 참조가 다르다");
        }
        if(strVar1.equals(strVar2)){
            System.out.println("strVa1 과 strVar2는 문자열이 같다"); //equals 는 문자열 비교
        }
        String strVar3 = new String("신민철");
        String strVar4 = new String("신민철");

        if(strVar3==strVar4){
            System.out.println("strVar3 과 strVar4는 참조가 같다");
        }else{
            System.out.println("strVar3 과 strVar는 참조가 다르다");
        }
        if(strVar3.equals(strVar4)){
            System.out.println("strVar3과 strVar4는 문자열이 같음");
        }
    }
}