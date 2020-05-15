public class EnumMethodExample {//#열거 객체의 메소드#

    public enum Week{
        MONDAY,
        TUSEDAY,
        WEDNESDAY,
        THUSEDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    public static void main(String[] args) {
        //name()메소드
       
        
       

        Week today = Week.SUNDAY;
        String name = today.name();
        System.out.println(name);   //일요일을 받아서 출력한다

        //orignal() 메소드
        int ordinal = today.ordinal(); 
        System.out.println(ordinal); // 열거 순번대로 출력 0~6 0부터시작
        //compareTo
        Week day1 = Week.MONDAY; 
        Week day2 = Week.WEDNESDAY;
        int result1 = day1.compareTo(day2);
        int result2 = day2.compareTo(day1);
        System.out.println(result1);
        System.out.println(result2);//매개값으로 기준으로 전후 몇번째위치 순번이 빠르면 음수 느리면 양수

        //valueOf메소드
        if(args.length == 1){
            String strDay = args[0];
            Week weekDay = Week.valueOf(strDay);
            if(weekDay == Week.SATURDAY | weekDay == Week.SUNDAY){
                System.out.println("주말 이군요");
            }else{
                System.out.println("평일 이군요");
            }
        }
        //values()메소드 
        Week[]days = Week.values();
        for(Week day : days){
            System.out.println(day);// 열거타입을 배열로 만들어출력
        }
    }
    
}