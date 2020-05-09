public class ForSumFrom1To100Example {//#1부터 100까지 합을 출력#
    public static void main(String[] args) {
        int sum = 0;     // <--합을구하기전 for문 밖에 sum을 두어야 i 결과갑에대한 sum을 담으면서 더한다

        for(int i=1; i<=100; i++){
            sum +=i;
        }
        System.out.println("1~100 합 :" + sum);
    }
    
}