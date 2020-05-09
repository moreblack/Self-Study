public class Exercise041 {//#while문으로 주사위 만들기#
    public static void main(String[] args) {
        while(true){ //while은 조건이 성립되면 발동
        
        int num1 = (int)(Math.random()*6)+1;
        int num2 = (int)(Math.random()*6)+1;
    
        
        System.out.println("("+num1+","+num2+")");
        
        if(num1+num2==5)
        
        break;
         
         
        
        }
       
    }
    
}