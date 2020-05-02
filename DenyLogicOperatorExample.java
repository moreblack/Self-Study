public class DenyLogicOperatorExample {//#논리 부정 연산자#
    public static void main(String[] args) {
        
        boolean play = true;
        
        System.out.println(play);
        

        play = !play;   //"!"<-부정연산자  true의 반대  = false

        System.out.println(play);

        play = !play;  //false의 반대  = true;

        System.out.println(play);
    }
    
}