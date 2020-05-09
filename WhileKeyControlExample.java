public class WhileKeyControlExample {//#키보드로while문 제어#
    public static void main(String[] args) throws Exception{//<---thorws Exception 예외를 던져야 System.in.read를 실행가능
        boolean run = true;
        int speed = 0;
        int keyCode = 0;

        while(run){
            if(keyCode!=13 && keyCode!=10){//<--키코드는 엔터의 키코드이기때문에 값을 제외시킴
                System.out.println("-----------------------");
                System.out.println("1.증속|2.감속|3.중지");
                System.out.println("-----------------------");
                System.out.print("선택: ");
            }

          keyCode = System.in.read();

        
        if(keyCode == 49){ // 키코드49  = 숫자 1임
            speed++;
            System.out.println("현재 속도=" + speed);
        }else if(keyCode == 50){//키코드50   = 숫자 2임
            speed--;
            System.out.println("현재 속도=" + speed);
        }else if(keyCode == 51){//키코드51   = 숫자 3임
            run = false;
        } 
    }
    System.out.println("프로그램 종료");
    }
}
 
    

