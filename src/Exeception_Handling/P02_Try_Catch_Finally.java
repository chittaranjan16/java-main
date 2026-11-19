package Exeception_Handling;

public class P02_Try_Catch_Finally {

    public static void main(String[] args) {


        // Syntax:
        //
        // try {
        //     risky code;
        // }
        // catch (ExceptionType e) {
        //     handling code;
        // }


        System.out.println("Program Started");

        try {

            int a = 10;
            int b = 0;

            int result = a / b;

            // This statement will not execute.
            System.out.println(result);

        } catch (ArithmeticException e) {
            // Exception is handled here.
            System.out.println("Cannot divide by zero!");
            // getMessage() returns the exception message.
            System.out.println("Message: " + e.getMessage());
        }

        // Execution continues after catch.
        System.out.println("Program Ended");


        // ----------------------------------------------------
        // 3. MULTIPLE CATCH BLOCKS
        // ----------------------------------------------------

        // We can use multiple catch blocks to handle
        // different types of exceptions.

        try {
            int[] arr = {10, 20, 30};
            System.out.println(arr[5]);    //exeception Arrayindexout of bound

        } catch (ArithmeticException e) {

            System.out.println("Arithmetic problem");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid array index");

        } catch (Exception e) {

            // General exception should come after specific ones.
            System.out.println("Some other exception occurred");
        }


        // ----------------------------------------------------
        // 4. NESTED TRY-CATCH
        // ----------------------------------------------------

        // A try block inside another try block is called
        // nested try.
        //
        // It is useful when different operations need
        // separate exception handling.

        try {

            System.out.println("Outer try started");

            try {

                int result = 10 / 0;

            } catch (ArithmeticException e) {

                System.out.println("Inner catch executed");
            }

            System.out.println("Outer try continues");

        } catch (Exception e) {

            System.out.println("Outer catch executed");
        }


        // ----------------------------------------------------
        // 5. FINALLY BLOCK
        // ----------------------------------------------------

        // finally block normally executes whether an exception
        // occurs or not, including when a catch handles it.
        //
        // It is commonly used for cleanup operations like
        // closing files and releasing resources.

        try {

            System.out.println("Inside try");

            int result = 10 / 2;

        } catch (ArithmeticException e) {

            System.out.println("Inside catch");

        } finally {

            System.out.println("Inside finally");
        }


        // ----------------------------------------------------
        // 6. FINALLY WHEN EXCEPTION OCCURS
        // ----------------------------------------------------

        try {

            int result = 10 / 0;

        } catch (ArithmeticException e) {

            System.out.println("Exception handled");

        } finally {

            System.out.println("Finally always executes normally");
        }


        // ----------------------------------------------------
        // 7. IMPORTANT RULES
        // ----------------------------------------------------

        // 1. A try block must be followed by catch or finally.
        // 2. A try block can have multiple catch blocks.
        // 3. Only the first matching catch block executes.
        // 4. Specific catch blocks must come before general ones.
        // 5. Nested try-catch is allowed.
        // 6. finally is normally executed whether exception occurs or not.
        // 7. A finally block may not execute if the JVM terminates abruptly, for example through System.exit().

    }
}

