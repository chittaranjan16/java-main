
package Exeception_Handling;

public class custom_exeception_example {

    public static void main(String[] args) {

        try {
            passwordCheck("asdGGhj");
        }
        catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }



    public static void passwordCheck(String pw) throws InvalidPasswordException {

        if (pw.length() < 8) {
            throw new InvalidPasswordException(
                    "Password is too short!"
            );
        }

        System.out.println("Valid password");
    }
}




// Custom checked exception
class InvalidPasswordException extends Exception {

    InvalidPasswordException(String message) {
        super(message);
    }
}
