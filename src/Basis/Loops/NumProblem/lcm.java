package Basis.Loops.NumProblem;

public class lcm {

//    least coomon multiple

//    • Example (3 and 4):
//	• Multiples of 3: 3, 6, 9, 12, 15, 18...
//	• Multiples of 4: 4, 8, 12, 16, 20...
//	• LCM = 1

    static int findLCM(int num1 , int num2){
        int a = num1;
        int b = num2;
        int n = 1 ;

        n= Math.max(a,b);

        while(n>0){
            if((n%a==0) && (n%b==0)){
                break;
            }
            n++;
        }
        return n;
    }





    public static void main(String[] args) {
        System.out.println(findLCM(3,4));
        System.out.println(findLCM(3,5));
        System.out.println(findLCM(7,8));
    }

}
