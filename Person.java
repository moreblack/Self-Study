public class Person {
    final String nation = "Korea";
    final String ssn; //final 초기값이 정해지면 최종값이 되어 실행도중 수정할수 없다는것
    String name;

    public Person (String ssn,String name){
        this.ssn = ssn;
        this.name =  name;

    }
    
}