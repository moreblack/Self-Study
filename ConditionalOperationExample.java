public class ConditionalOperationExample {//#삼항 연산자#
    public static void main(String[] args) {//삼항 연산자 조건식// 피연산자 1 ? 피연산자2 : 피연산자3
        int score = 85;
        char grade =(score > 90)?'A':((score > 80)?'B' : 'C');
        System.out.println(score + "점은" + grade + "등급입니다.");
    }
    
}