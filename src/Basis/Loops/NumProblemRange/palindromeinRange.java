package Loops.NumProblemRange;

public class palindromeinRange {

    static void palindromeRange(int start , int end){
        int s = start;
        int e = end;


        for(int num = s ; num < e ; num++){
            int temp = num;
            int reverse = 0;

            while (temp>0){
                int rem = temp%10;

                reverse=reverse*10 + rem;
                temp=temp/10;
            }

            if(reverse == num){
                System.out.print(num+ " ");
            }
        }
    }


    static void main(String[] args) {
        palindromeRange(10,150);
    }
}
