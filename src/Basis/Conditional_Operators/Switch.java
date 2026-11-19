package Conditional_Operators;

import java.util.Scanner;

public class Switch {

    static void main(String[] args){

        System.out.print("enter day number : ");
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();

        switch (day) {
            case 1:{
                System.out.println("Monday");
            }
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday"); // Prints Wednesday
                break;
            default:
                System.out.println("Weekend");
                break;
        }
    }
}
