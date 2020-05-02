public class OverflowExample {//#오버플로우 , 오버플로우해결#
    public static void main(String[] args) {
        int x = 1000000;    //int 타입의 숫자 초과 (오버플로우라고 함)
        int y = 1000000;
        int z = x * y;    
        System.out.println(z);
   
   
   
        long a = 1000000; // long타입으로 범위를 늘리면 가능
        long b = 1000000;
        long c = a * b;
        System.out.println(c);
    }
    
}

    