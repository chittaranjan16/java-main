package Basis.Loops.NumProblem;

public class binary2Decimal {
    void binaryToDeci(int binaryNum){

        int n  = binaryNum;
        int sum = 0;

        int i = 0;

        while (n>0){
            int rem = n%10;

            rem = rem* Math.powExact(2,i);

            i++;

            sum = sum + rem;
            n = n/10;
        }

        System.out.println(binaryNum +" Binary is converted into Decimal num : " + sum);
    }




//    decimmal to binary method

    void decimal2Binary(int decimalNUM){
        int temp = decimalNUM;

        //25 % 2 =1
        //25/2 =12  , 12%2=0
        //12/2 =6   . 6%2 =0

        int binary = 0;
        int place = 1; // 1, 10, 100, 1000...

        while (temp > 0) {
            int r = temp % 2;
            binary = binary + (r * place); // Places digit in correct place value
            place = place * 10;
            temp = temp / 2;
        }
        System.out.println("Dcimal num " + decimalNUM + " is : " +binary);


    }
}





class test {
    static void main(String[] args) {

        binary2Decimal d1 = new binary2Decimal();
        d1.binaryToDeci(10011);
        d1.binaryToDeci(11101);


        d1.decimal2Binary(29);
        d1.decimal2Binary(4);
    }


}







