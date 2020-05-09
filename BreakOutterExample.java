public class BreakOutterExample {//#바깥쪽 반복문 종료#
    public static void main(String[] args) {
        Outter:for(char upper='A'; upper<='Z'; upper++){ //대문자 A가 Z될때까지 반복
               for(char lower='a'; lower<='z'; lower++){ //대문자 A한번돌때 소문자 a가 z될때까지 반복 그다음 대문자B부터
                   System.out.println(upper+"-"+lower);
                   if(lower=='g'){
                       break Outter;//소문자 g될때 브레이크 걸어서 전부다 빠져나옴
                   }
               }
        }
        System.out.println("프로그램 실행 종료");
    }
    
}