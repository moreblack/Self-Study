//#Do - while��#
import java.util.Scanner; //<--- Scanner Ŭ������ ����ϱ� ���� �ʿ�

public class DoWhileExample {
    public static void main(String[] args) {
        System.out.println("�޼����� �Է��ϼ���.");
        System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���");
    
        Scanner scanner = new Scanner(System.in);   //<---Scanner ��ü�� ����
        String inputString;

        do{
            System.out.println(">");
            inputString = scanner.nextLine(); //<-- Ű����� �Է��� ���ڿ��� ����
            System.out.println(inputString);
            
        }while( ! inputString.equals("q"));
        

        System.out.println();
        System.out.println("���α׷� ����");

    }

    
}