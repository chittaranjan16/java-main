package Exeception_Handling;

public class P01_Basic_Exception {
    public static void main(String[] args) {
        execeptionWithoutHandlinExample();
        execeptionWithExample();
    }



    public static void execeptionWithoutHandlinExample(){
        System.out.println("programs starts");
        int a = 10;
        int b  = 0;

        System.out.println(a/b);
        //arthemetic exeception we will get here , as 0 cant be used to divide

        System.out.println("programs ends");
    }


    public static void execeptionWithExample(){
        System.out.println("programs starts");
        int a = 10;
        int b  = 0;

        try{
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println("Arithemetic exeception handled");
        }

        //exeception handled by using try and catch block
        System.out.println("programs ends");
    }


}


// ============================================================
// JAVA EXCEPTION HANDLING
// FILE 01: BASIC EXCEPTION
// ============================================================

// 1. WHAT IS AN EXCEPTION?

// An exception is an unwanted or unexpected event that occurs
// during program execution and interrupts the normal flow.

// Examples:
// 1. Dividing a number by zero.
// 2. Accessing an invalid array index.
// 3. Converting an invalid String into an integer.
// 4. Accessing a method using a null reference.

// Exception handling helps us handle these situations
// without terminating the program abnormally.


// IMPORTANT:
// Statements after the exception are not executed
// unless the exception is handled.


// ----------------------------------------------------
// 4. COMMON RUNTIME EXCEPTIONS
// ----------------------------------------------------

// A. ArithmeticException
// Occurs during an invalid arithmetic operation.

// int num = 10 / 0;


// B. NullPointerException
// Occurs when we access something using a null reference.

// String name = null;
// System.out.println(name.length());


// C. ArrayIndexOutOfBoundsException
// Occurs when we access an invalid array index.

// int[] numbers = {10, 20, 30};
// System.out.println(numbers[5]);


// D. NumberFormatException
// Occurs when an invalid String is converted into a number.

// String value = "ABC";
// int number = Integer.parseInt(value);


// E. StringIndexOutOfBoundsException
// Occurs when we access an invalid String index.

// String text = "JAVA";
// System.out.println(text.charAt(10));


// ----------------------------------------------------
// 5. TYPES OF EXCEPTIONS
// ----------------------------------------------------

// Java's Throwable hierarchy has two major branches:
//
// Throwable
//    |
//    |---- Exception
//    |       |
//    |       |---- Checked Exceptions
//    |       |
//    |       |---- RuntimeException
//    |                 |
//    |                 |---- Unchecked Exceptions
//    |
//    |---- Error
//
// CHECKED EXCEPTIONS:
// Checked by the compiler.
// Must be handled using try-catch or declared using throws.
//
// Examples:
// IOException
// SQLException
// ClassNotFoundException
//
// UNCHECKED EXCEPTIONS:
// Occur at runtime.
// Compiler does not force us to handle or declare them.
//
// Examples:
// ArithmeticException
// NullPointerException
// ArrayIndexOutOfBoundsException
//
// ERRORS:
// Serious problems generally outside normal application
// exception handling.
//
// Examples:
// OutOfMemoryError
// StackOverflowError


// ----------------------------------------------------
// 6. EXCEPTION VS ERROR
// ----------------------------------------------------

// Exception:
// An application-level problem that a program may handle.
//
// Error:
// A serious problem generally related to the JVM or
// execution environment.
//
// Both Exception and Error extend Throwable.


// ----------------------------------------------------
// 7. IMPORTANT POINTS TO REMEMBER
// ----------------------------------------------------

// 1. Exception interrupts normal program execution.
// 2. Exceptions can occur at runtime.
// 3. Java provides built-in exception classes.
// 4. We can also create our own custom exceptions.
// 5. try-catch is used to handle exceptions.
// 6. throw is used to explicitly throw an exception.
// 7. throws declares possible exceptions in a method.
// 8. finally is commonly used for cleanup operations.




