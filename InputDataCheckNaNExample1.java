public class InputDataCheckNaNExample1 {//#"NaN" 문자열의 문제점#
    public static void main(String[] args) {
        String userInput = "NaN";
        double val = Double.valueOf( userInput );

        double currentBalance = 10000.0;

        currentBalance += val;
        System.out.println(currentBalance);

    }
    
}