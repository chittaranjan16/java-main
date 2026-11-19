package Basis.Loops.NumProblem;

public class strongNUM {

    static void strong(int n){
        int num = n;
        int temp = num;


        int sum = 0;

        while (temp>0){
            int rem= temp%10;

            int fact=1;
            while (rem>0){
                fact=fact*rem;
                rem--;
            }

            sum=sum+fact;
            temp=temp/10;
        }

        if(sum == n){
            System.out.println(n+ ": it is a strong number");
        }
        else System.out.println(n+ ": it is not a  strong number");
    }



    public static void main(String[] args) {
        strongNUM.strong(145);
    }
}
