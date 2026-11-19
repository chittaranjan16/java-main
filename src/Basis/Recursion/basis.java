package Basis.Recursion;

public class basis {

    static void display(int n){


//        base case to elimate repeative calls
        if (n == 0) {
            return;
        }


        System.out.println(n);

//        recurvive call
        display(n-1);
    }



    public static void main(String[] args) {
        display(5);
    }
}
