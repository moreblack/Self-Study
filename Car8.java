public class Car8 {//#정적메소드와 블록 선언시 주의할점#
    int speed;

    void run(){
        System.out.println(speed + "으로 달립니다");
    }
    //정적 메소드 사용시 this 사용불가
    //인스턴스 멤버사용시 객체를 먼저 생성하고 참조변수로 사용

    public static void main(String[] args) {
        Car8 myCar = new Car8();
        myCar.speed = 60;
        myCar.run();
    }
}