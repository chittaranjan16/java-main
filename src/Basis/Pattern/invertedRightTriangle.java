package Pattern;

public class invertedRightTriangle {

    public static void main(String[] args) {

        int n = 5;

        for(int i = 1 ; i <= n ; i++) {
            System.out.println( );

            for(int j = n ;  j >=  i ; j-- ) {
                System.out.print("*");
            }
        }
    }

}
