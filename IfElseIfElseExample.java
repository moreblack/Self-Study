public class IfElseIfElseExample {//#if-else if-else문#
    public static void main(String[] args) {
        int score = 60;

        if(score>=90){
            System.out.println("점수가 100-90 입니다");
            System.out.println("등급은 A입니다.");
        }else if(score>=80){
            System.out.println("점수가 80-90 입니다.");
            System.out.println("등급은 B 입니다.");

        }else if(score>=70){
            System.out.println("점수가 70-79 입니다.");
            System.out.println("등급은 C입니다");

        }else{
            System.out.println("점수가 70 미만입니다. ");
            System.out.println("등급은 D 입니다.");
        }
    }
    
}