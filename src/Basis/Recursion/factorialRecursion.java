package Basis.Recursion;


//Program 3 — Factorial of a number
public class factorialRecursion {
    static int factorial(int n){

        if(n==0  || n==1){
            return 1;
        }

        return n * factorial(n-1);
    }




    public static void main(String[] args)
    {
//        factorial(5);
        System.out.println(factorial(5));
    }
}
