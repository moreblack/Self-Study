public class Exercise072 {
    public static void main(String[] args) {
        int max = 0;
        int[] array = { 1, 5, 3, 8, 2 };

        for (int arrays : array) {

            if ( max <arrays) {

                max = arrays;
         
            }

        }
        System.out.println("max: " + max);

    }

}
