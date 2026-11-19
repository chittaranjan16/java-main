package Basis.Loops.basis;

public class sumOfDigits {
    static void main(String[] args) {
        int num = 134;

        int digitsum = 0;

        while(num>0){
            int rem = num%10;
            digitsum+=rem;
            num = num/10;
        }

        System.out.println(digitsum + " : SUM OF DIGITS ");
    }




}

