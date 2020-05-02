public class GarbageValueExample{//#byte 타입 변수#
    public static void main(String[] args) {
       byte var1 = 125;
       int var2 = 125;
       for (int i=0; i<5; i++){ //i 자체가 반복횟수
           var1++;
           var2++;
           System.out.println("var1: " + var1 + "\t" + "var2:" + var2);
       } 
    }
}