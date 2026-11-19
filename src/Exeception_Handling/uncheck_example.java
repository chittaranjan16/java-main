package Exeception_Handling;

public class uncheck_example {
    public static void main(String[] args) {

        //checkpassword("abcd123");

        try {
            checkpassword("abcd12673");
        }
        catch (InvalidPasswordEx e){
            System.out.println(e.getMessage());
        }
        System.out.println("ends");
    }


    public static void checkpassword(String s) throws InvalidPasswordEx{

        if(s.length() < 8){
            throw new InvalidPasswordEx("passwords length must be more than 8 ");
        }
        System.out.println("program ends");
    }
}



class InvalidPasswordEx extends RuntimeException{

    InvalidPasswordEx(String msg){
        super(msg);
    }

}


