package Basis.Loops.basis;

public class multificationtable {

    static void table(int num , int tillnum){
        int n = num;
        int t = tillnum;

        for(int i=1; i<=t ; i++){
            int r = i*n;

            System.out.println( n + " * "+ i+ " = " + r);
        }

    }


    public static void main(String[] args) {

        table(19,10);
    }
}
