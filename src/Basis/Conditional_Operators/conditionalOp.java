package Basis.Conditional_Operators;

public class conditionalOp {

    static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 34;


//        biggest of three number
//        condition ? opn1 : opn2 ;


        int res = a>b ? (a>c ? a:c) : (b>c ? b:c) ;
        System.out.println(res);


        boolean res1 = a%3 == 0 ? true : false ;
        System.out.println(res1);
    }
}
