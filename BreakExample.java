public class BreakExample {//#break로 while문 종료#
    public static void main(String[] args) {
        while (true) {
            int num = (int) (Math.random() * 6) + 1;
            System.out.println(num);
            if (num == 6) {
                break;// 주사위를 던져서 6이 나오면 브레이크 걸어서 종료
            }
        }
    System.out.println("프로그램종료");
    }
}