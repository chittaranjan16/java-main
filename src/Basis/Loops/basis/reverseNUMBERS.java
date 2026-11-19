package Basis.Loops.basis;

public class reverseNUMBERS {

    public static void main(String[] args) {
        int num = 123;

        int reverse = 0;

        while(num>0){
            int rem = num%10;
            reverse = reverse*10 + rem;
            num=num/10;
        }
        System.out.println(reverse);
    }
}
