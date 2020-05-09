public class ContinueExample {//#continue를 사용한 for문#
    public static void main(String[] args) {
       
        for(int i=1; i<=10; i++) {
            
            if( i % 2 !=0){ //i를 2로 나눈 값으 나머지가 0이 아닌경우
                continue; //continue 는 문장을 실행하지 않고 다음으로 넘아감 break는 멈추고
            }
            System.out.println(i);
        }
    }
    
}