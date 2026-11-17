/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ai_assistant_ilisan_prob3;

/**
 *
 * @author LENOVO LOQ
 *
 */


public class Ai_assistant_ilisan_prob3 {

 //1. Hand-trace factorial(4) with the AI's code. What does it return, and why?
//It returns 0 because the base case incorrectly returns 0 instead of 1.
//The calculation becomes:4x3x2x1x0=0
    
    //2. Which single line is wrong, and what should it return instead?
    //Incorrect:if (n == 0) { return 0; }
    //Correct:if (n == 0) { return 1; }

    public static int factorial(int n) {

        // Base case
        if (n == 0) {
            return 1;
        }

        // Recursive case
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        System.out.println("factorial(0): " + factorial(0));
        System.out.println("factorial(1): " + factorial(1));
        System.out.println("factorial(4): " + factorial(4));
        System.out.println("factorial(5): " + factorial(5));
    }
}

//Test	              Expected	Your result	Pass?
//factorial(0)	          1	   1	       Yes
//factorial(1)	          1	   1	       Yes
//factorial(4)	          24	   24	       Yes
//factorial(5)	         120	  120	       Yes


//1. Why did one wrong return make every result wrong?
//Because the base case returned 0 instead of 1. 
//Every recursive result was multiplied by that zero, making all results zero.

//2. Stretch: What happens for factorial(-2) with your corrected code, and why?
//The method keeps calling itself with smaller negative numbers because it never reaches the base case n == 0.
//Eventually, it causes a StackOverflowError.
