import java.util.Scanner;//#학생#

public class Exercise092 {
    public static void main(String[] args) {
        boolean run = true;
        int studentNum = 0;
        int[] scores = new int[5];
        int max = 0;
        int sum = 0;
        double avg = 0;
        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("=============================================");
            System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
            System.out.println("=============================================");
            System.out.print("선택> "); //println 다음줄 커서 print일때는 커서가 바로옆에

            int selectNo = scanner.nextInt();//selectNo 선택하기 위한 숫자키 입력

            if (selectNo == 1) {
                System.out.println("===학생수를 입력하세요===");
                System.out.print("학생수> ");
                studentNum = scanner.nextInt();  //학생수를 담기위한 숫자키 입력

            } else if (selectNo == 2) {
                System.out.println("===점수를 입력하세요===");
                for (int i = 0; i < studentNum; i++) { //점수입력시 입력된 학생수 만큼 범위를 정한다

                    System.out.print("scores[" + i + "] :");
                    scores[i] = scanner.nextInt(); //학생수만큼 숫자키를 입력해서 배열에 담는다
                }

            } else if (selectNo == 3) {
                System.out.println("===점수 리스트===");
                for (int k = 0; k < studentNum; k++) {//입력된 학생수만큼 출력되게 범위를 정하여 바로출력시킨다

                    System.out.println("scores[" + k + "] :" + scores[k]);
                }
            } else if (selectNo == 4) {
                System.out.println("===분석 결과===");
                for (int a : scores) { //배열중에 max=0과 비교하여 큰숫자가 max로 다시 배치 시켜 최대값을 찾는다.
                    if (max < a) {
                        max = a;
                    }

                }
                for (int b : scores) {
                    sum += b;
                }
                avg = (sum / studentNum);// 배열을 정수로 담아 합계를 출력하여 학생수만큼 나누어 평균을 구한다.

                System.out.println("최고점수 :" + max);
                System.out.println("평균점수 :" + avg);
            } else if (selectNo == 5) {
                System.out.println("프로그램종료");
                break;

            }
        }

    }
}