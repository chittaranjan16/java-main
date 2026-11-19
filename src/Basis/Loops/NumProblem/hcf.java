package Loops.NumProblem;

public class hcf{

//              Factors of 10: 1, 2, 5, 10
//            • Factors of 15: 1, 3, 5, 15

//            • Common Factors: 1, 5
//            • Highest Common Factor (HCF): 5

    static int findLCM(int num1 , int num2){
        int a = num1;
        int b = num2;
        int n ;

        n = Math.min(a, b);

        while (n > 0) {
            if ((a % n == 0) && (b % n == 0)) {
                break;
            }
            n--;
        }
        return n;
    }






    public static void main(String[] args) {
        System.out.println(findLCM(10, 15));
        System.out.println(findLCM(23, 67));
        System.out.println(findLCM(30, 60));
    }
}
