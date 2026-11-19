package Basis.Loops.NumProblemRange;

public class alternatePrime {

    void alterPrimeNum(int start , int end){
        int s = start;
        int e = end;

        int count=0;

        for(int num = s ; num <= e ; num++){

            boolean flag = true;

            for(int i = 2 ; i <= num/2 ; i++){

                if(num%i==0){
                    flag=false;
                    break;
                }
            }
            if(flag) {
                count++;
                if (count % 2 == 1) {
                    System.out.print(num + " ");
                }
            }
        }
    }
}



class test{
    static void main(String[] args) {
        alternatePrime a1 = new alternatePrime();
        a1.alterPrimeNum(3,20);
        System.out.println();
        a1.alterPrimeNum(1,100);

    }
}