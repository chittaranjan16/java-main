package Exeception_Handling;


public class P04_Custom_Exception {

    public static void main(String[] args) {


        try {                                                     //for checked exeception we must use try and catch to handle these as it checked at realtime when you enters the value , it shows signal that it make give exception
            validateAge(16);
        } catch (InvalidAgeException e) {

            System.out.println("Age Error: " + e.getMessage());
        }

        withdraw(200,3000);
    }

    //checked
    static void validateAge(int age) throws InvalidAgeException {

        if (age < 18) {

            // Throwing our own checked exception.
            throw new InvalidAgeException(
                    "Age must be 18 or above"
            );
        }

        System.out.println("Age validation successful");
        System.out.println("program executed");
    }


    //unchecked
    public static void withdraw(int balance, int amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Withdrawal amount must be positive"
            );
        }

        if (amount > balance) {
            // Throwing our own unchecked exception.
            throw new InsufficientBalanceException("Insufficient account balance" );
        }

        System.out.println("Withdrawal successful");
        System.out.println("Remaining balance: " + (balance - amount));
    }




}

// checked


class InvalidAgeException extends Exception {
    // Constructor receives the error message.

    InvalidAgeException(String message) {

        // super() calls the parent Exception constructor.
        // It stores the message inside the exception object.
        super(message);
    }
}


//custom exeception unchecked
class InsufficientBalanceException extends RuntimeException {

    InsufficientBalanceException(String message) {
        super(message);
    }
}




//1. WHAT IS A CUSTOM EXCEPTION?

// Java provides built-in exceptions such as:
// ArithmeticException, NullPointerException, IOException.

// But sometimes our application has specific business rules.

// Examples:
// 1. Age must be 18 or above.
// 2. Bank balance must be sufficient for withdrawal.
// 3. Marks must be between 0 and 100.
// 4. Password must meet minimum requirements.

// For these situations, we can create our own exception class.
// This is called a CUSTOM or USER-DEFINED EXCEPTION.



// ============================================================
// CHECKED VS UNCHECKED CUSTOM EXCEPTION
// ============================================================

// Checked:
// class MyException extends Exception

//To create a checked exception, extend Exception.
// Because it extends Exception (not RuntimeException),
// Java requires the caller to handle or declare it.



// Unchecked:
// class MyException extends RuntimeException

// To create an unchecked exception, extend RuntimeException.
// Java does not force the caller to catch or declare it.
