package Basis.Loops.basis;

public class countDigits {

    static void countnumofdigits(int n){
        int num = n;

        int count=0;
        while (num>0){
           count++;
           num=num/10;
        }
        System.out.println("NUMBER OF DIGITS : " + count);
    }



    public static void main(String[] args) {
        countnumofdigits(234567);
    }
}



