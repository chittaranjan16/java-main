package Loops.NumProblem;

import java.util.Scanner;

//perfect number  (factors)
// 6 = 1+2+3   right
//8 = 1 + 2 + 4    8 != 7    wrong

public class perfectNUM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER : ");
        int num = sc.nextInt();

        boolean flag = true;

        int sum = 0;

        for(int i = 1 ; i<num ; i++){
            if(num%i == 0){
                sum+=i;
            }
        }

        if(sum == num){
            System.out.println(num + "IT IS A PERFECT NUM");
        }
        else System.out.println("it is not");

    }
}
