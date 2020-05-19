public class ABCclass {//#클래스의 접근제한#
    
}
class A{}// <--default 접근제한

public class B{
    A a; // A클래스 접근 가능 같은패키지
};
public class C{
    A a; //x A클래스 접근 불가 패키지가 다름
    B b; //o B클래스 접근 가능 B클래스는 public으로 공개됨
};
