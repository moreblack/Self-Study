public class Calculator2 {
    int plus(int x , int y){ //doulbe 타입 호출
        int result = x + y;
        return result;
    }

    double avg(int x, int y){ // exetute 호출
        double sum = plus(x,y);
        double result = sum/2;
        return result;
    }

    void execute(){
        double result = avg(7,10);
        System.out.println("실행결과: " + result);
    }

    void println(String message){ //실행결과 호출
        System.out.println(message);
    }
}