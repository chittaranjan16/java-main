package Pattern;

public class centerTriangle {
    public static void main(String[] args) {
        int n = 5; // Total rows

        for (int i = 1; i <= n; i++) {

            // 1. Loop for Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // 2. Loop for Stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
