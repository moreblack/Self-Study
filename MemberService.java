public class MemberService {
      
    String  ID ;
    String  Password ;

    MemberService(){
     }

     void logout(String ID){
         this.ID = ID;
         System.out.println("로그아웃 되었습니다.");
     }

     Boolean login(String ID,String Password){
       
        this.ID = ID;
        this.Password = Password;

        return true;
        
     }
    



    

  
    
    
}