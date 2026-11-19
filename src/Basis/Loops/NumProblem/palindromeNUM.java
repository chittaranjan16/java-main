package Basis.Loops.NumProblem;

public class palindromeNUM {

    static void palindrome(int num) {

        int n = num;
        int temp = n;
        int reverse = 0;

        while (temp > 0) {
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp = temp / 10;
        }

        if (reverse == n) {
            System.out.println("It is a palindrome number : " + n );
        } else {
            System.out.println("It is not a palindrome number : " + n );
        }

    }



    public static void main(String[] args) {
        palindrome(131);
    }
}
