package Basis.Loops.NumProblem;

import java.util.Scanner;

public class primeNUM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER : ");
        int num = sc.nextInt();

        boolean flag = true;

        for(int i = 2 ; i < num/2 ; i++){
            if(num%i == 0 ){
                flag=false;
                break;
            }
        }


        if(flag==false) {
            System.out.println("it is a not prime number : " + num);
        }
        else
            System.out.println("it is a  prime number : " + num);

    }
}
