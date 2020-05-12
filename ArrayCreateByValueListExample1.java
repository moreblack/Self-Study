public class ArrayCreateByValueListExample1 {//#값 목록으로#
    public static void main(String[] args) {
        int[] scores = {83,90,87}; // [] 배열 순서는 0,1,2,3,4로 한다

        System.out.println("score[0] :" + scores[0]);
        System.out.println("score[0] :" + scores[1]);
        System.out.println("score[0] :" + scores[2]);

        int sum = 0;
        for(int i=0; i<3; i++){
            sum += scores[i];

        }
        System.out.println("총합:" + sum);
        double avg = (double)sum /3;
        System.out.println("평균:"+avg); 
    }
    
}