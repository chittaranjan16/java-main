package Loops.NumProblemRange;

public class fibonacciInRange {

    static void fibonacciRange(int start, int end){
        int s = start;
        int e = end;

        int a = 0;
        int b= 1;

        for(int i = 0 ; i <e ; i++){

            if(a >= s && a <=e ){
                System.out.print(a + " ");
            }

            int c =a+b;
            a=b;
            b= c;
        }
    }


    static void main(String[] args) {
        fibonacciRange(10,100);
    }
}
