public class Exercise051 {//#중첩 for문으로 방정식 출력#
    public static void main(String[] args) {
       

        for(int x=1; x<=10; x++){
              
            for(int y=1; y<=10; y++){
            
                if(4*x + 5*y != 60){  //<--60의 해를 구해서 출력해야하기때문에 60이 아닌것들을 안나오게함
                 continue;
                 
                 
                }
                System.out.println("("+x+","+y+")");
            }
        
             
        
        }
              
            
            
        }
        
    }
    
