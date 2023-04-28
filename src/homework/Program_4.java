package homework;

public class Program_4 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i <= rows; i++) {
                // i=0, j = 0

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
