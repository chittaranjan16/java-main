package Loops.NumProblemRange;

public class prime {

    static void primeInRange(int start, int end){
        int s  = start;
        int e= end;


        for(int num = s; num <= e ; num++){

            boolean flag = true;

            for (int i = 2 ; i < num/2 ; i++){
                if(num%i == 0 && num>=1){
                    flag=false;
                    break;
                }
            }
            if(flag) {
                System.out.print(num + " ");
            }
        }
    }



    public static void main(String[] args) {
        primeInRange(10,20);

    }
}
