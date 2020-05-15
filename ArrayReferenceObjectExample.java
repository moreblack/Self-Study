public class ArrayReferenceObjectExample {//#객체를 참조하는 배열#
    public static void main(String[] args) {
        String[] strArray = new String[3];
        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");


        System.out.println( strArray[0] == strArray[1]); // java=java 는 같다
        System.out.println( strArray[0] == strArray[2]);// 서로 참조하는 객체가 다르다
        System.out.println( strArray[0].equals(strArray[2]));//참조가 다르지만 문자열은 같다
    }
    
}