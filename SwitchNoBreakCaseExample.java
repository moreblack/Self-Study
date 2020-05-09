public class SwitchNoBreakCaseExample {//#break 없는 case문#
    public static void main(String[] args) {
        int time = (int)(Math.random()*4)+8;  // 곱셈으로 정수 생기는 것으로 8~11까지의 수가 나온다
        System.out.println("[현재시간:" +time + "시]");

        switch(time){
            case 8:
            System.out.println("출근합니다.");
            case 9:
            System.out.println("회의를 합니다.");
            case 10:
            System.out.println("업무를 봅니다.");
            default:
            System.out.println("외근을 나갑니다.");
            
        }//break가 없으므로 모두 다 출력하여 나온다
    }
    
}