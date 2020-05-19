public class PersonExample {//#final 필드 테스트#
    public static void main(String[] args) {
        Person p1 = new Person("123456-1234567","계백");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);


        //p1. nation = "USA";
        //p1. "654321-987654" <<<<----final 필드는 도중에 수정불가
        p1.name = "을지문덕";
    }
    
}