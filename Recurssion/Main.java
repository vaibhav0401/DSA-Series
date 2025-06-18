package Recurssion;

import static Recurssion.Fibonacci.getFibonacci;
import static Recurssion.Fibonacci.printFibonacci;
import static Recurssion.Print1toN.printForward;
import static Recurssion.PrintNto1.printBackward;
import static Recurssion.Sum1toN.getSum;
import static Recurssion.SumOfArrayElements.getArraySum;
import static Recurssion.factorial.getFactorial;

public class Main
{
    public static void main(String[] args) {
        System.out.println("Helo inside main method - Recursion");

        int result = getFactorial(5);
        System.out.println("The factorial of " + 5 + " is: " + result);

        printBackward(5);
        System.out.println();
        printForward(5);

        System.out.println("\nSum of first 5 natural numbers is: " + getSum(5));


        System.out.println("fibonacci of element - "+getFibonacci(5));
        printFibonacci(5);

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("\nSum Of array = "+getArraySum(arr,5));

    }




}
