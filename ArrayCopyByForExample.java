public class ArrayCopyByForExample {//#for문으로 배열 복사#
    public static void main(String[] args) {
        int[] oldIntArray = {1,2,3};
        int[] newIntArray = new int[5];

        for(int i=0; i<oldIntArray.length; i++){
            newIntArray[i] = oldIntArray[i];     //3칸짜리를 5칸짜리에 넣는다
        }
        for(int i=0; i<newIntArray.length; i++){
            System.out.println(newIntArray[i]+",");//3칸짜리 + 2칸짜리빈공간이 출력된다
        }
    }
    
}