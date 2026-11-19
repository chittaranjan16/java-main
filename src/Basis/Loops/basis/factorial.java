package Basis.Loops.basis;

import java.util.Scanner;

public class factorial {
    static void main(String[] args) {


//        5! = 1*2*3*4*5
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER");
        int n = sc.nextInt();

        int fact = 1;

        for(int i = 1 ; i <=n ; i++){
            fact*=i;
        }
        System.out.println(fact + " : Factorial of num " + n);

    }
}
