public class Exercise02 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = (++x) + (y--);
        int a = y--;
        int b = --y; 
        System.out.println(z);
        System.out.println(a);
        System.out.println(b);
    }
    
}