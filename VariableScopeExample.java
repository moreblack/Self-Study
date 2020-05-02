public class VariableScopeExample {//#변수의 사용 범위#
    public static void main(String[] args) {
       int v1 = 15;
       
       if(v1 >10){
           int v2 = v1 -10;
           
       }
       int v3 = v1 + v2 + 5;

       System.out.println(v3);
    }
    
}