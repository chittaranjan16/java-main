package Basis.Loops.NumProblem;

public class neonNUM {
    static void neon(int n){
        int num = n;

        int sum= 0;
        int sqnum = num*num;

        while (sqnum>0){
            int rem = sqnum%10;

            sum = sum+ rem;
            sqnum=sqnum/10;
        }

        if (sum == n){
            System.out.println("It is a neon number : " + n);
        }
        else System.out.println("It is not a  neon number : " + n);
    }




    public static void main(String[] args) {
        neon(9);
    }
}
