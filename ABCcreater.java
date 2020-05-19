public class ABCcreater {// #생성자 접근제한#
}

public class A {
    // 필드
    A a1 = new A(true);
    A a2 = new A(1);
    A a3 = new A("문자열");

    // 생성자
    public A(boolean b) {
    } // public 접근제한

    A(int b) {
    } // default 접근제한

    private A(String s) {
    } // private 접근제한
}

public class B {// --패키지가 동일
    // 필드
    A a1 = new A(true);
    A a2 = new A(1);
    A a3 = new A("문자열");// private 생성자 접근불가
}

public class C { // --패키지가 다름
    // 필드
    A a1 = new A(true);
    A a2 = new A(1); // default 생성자 접근불가
    A a3 = new A("문자열");// private 생성자 접근불가
}
