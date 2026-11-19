package Basis.Loops.NumProblem;

public class automorphicNUM {

    static void automorphic(int n){
        int num = n;

//        5 sq = 25   5==5

        int sq = num*num;
        boolean flag = true;

        while (num>0){
            if((num%10) != (sq%10)){
                flag=false;
                break;
            }
            num=num/10;
            sq=sq/10;
        }


        if(flag){
            System.out.println("It is a automophic number : " + n);
        }
        else System.out.println("It is not a  automophic number");

    }




    public static void main(String[] args) {
        automorphic(26);
        automorphic(25);
        automorphic(9);
        automorphic(5);
        automorphic(76);
    }
}
