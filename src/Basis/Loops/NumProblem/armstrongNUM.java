package Loops.NumProblem;

public class armstrongNUM {

    static void armstrong(int n){
        int num = n;
        int temp = num;

        int count=0;

//        to count digits and use it for power of number
        while(temp>0){
            count++;
            temp=temp/10;
        }

        temp = num;
        int sum=0;

        while (temp>0){
            int rem = temp%10;
            sum = sum + (int)Math.pow(rem,count);
            temp=temp/10;
        }

        if(sum == n){
            System.out.println("It is a armstrong number :" + n);
        }
        else System.out.println("It is not a  armstrong number :" + n);
    }




    public static void main(String[] args) {
        armstrong(153);
    }
}
