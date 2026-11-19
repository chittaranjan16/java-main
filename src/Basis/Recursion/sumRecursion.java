package Basis.Recursion;


//Sum of numbers from 1 to N
//Problem: Calculate \(1 + 2 + 3 + 4 + 5\) using recursion.
public class sumRecursion {

    static int sum(int n){

        if(n==0){
            return 0 ;
        }

        return n + sum(n-1);
    }





    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
