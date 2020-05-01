public class CheckValueBeforeCasting {
    public static void main(String[] args) {
        int i =128;   

        if((i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)){
            System.out.println("byte 타입으로 변환할 수 없습니다.");
            System.out.println("값을 다시 확인해주세요");

        }else{
            byte b = (byte) i;  //128이 byte 값을 초과한다 -128 ~ 127 사이가 byte값이다
            System.out.println(b);
        }    
    }
    
}