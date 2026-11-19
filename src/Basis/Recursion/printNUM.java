package Recursion;


//Program 1 — Print numbers from 1 to N

public class printNUM {
        static void print(int n){

            if(n==0){
                return;
            }

            print(n-1);
            System.out.println(n);
        }






        public static void main(String[] args) {
            print(9);
        }
}
