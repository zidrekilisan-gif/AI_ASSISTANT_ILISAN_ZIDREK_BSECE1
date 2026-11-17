/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ai_assistant_ilisan_prob2;

/**
 *
 * @author LENOVO LOQ
 */




//1. Base case (when does recursion stop?):

//The recursion stops when index >= grades.length, meaning all grades have been checked. Return 0.

//2. Recursive case (smaller problem each call):

//Check whether the current grade passes, then call the method again with index + 1 to check the next grade.

//3. Result for an empty array {}, and why:

//Return 0 because there are no grades to check.
//public class Ai_assistant_ilisan_zidrek_prob2 {
    
    
    
    

   
public class ai_assistant_ilisan_prob2 {

    // PART A: Using a loop
    public static int countPassing(int[] grades, int passingMark) {
        int count = 0;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= passingMark) {
                count++;
            }
        }

        return count;
    }

    // PART B: Using recursion
    public static int countPassingRecursive(int[] grades, int passingMark, int index) {

        // Base case
        if (index >= grades.length) {
            return 0;
        }

        // Recursive case
        if (grades[index] >= passingMark) {
            return 1 + countPassingRecursive(grades, passingMark, index + 1);
        } else {
            return countPassingRecursive(grades, passingMark, index + 1);
        }
    }

    public static void main(String[] args) {

        int[] grades1 = {60, 75, 88, 74, 91};
        int[] grades2 = {};
        int[] grades3 = {70, 69, 80};
        int[] grades4 = {90, 55, 75, 100};

        System.out.println("Test 1:");
        System.out.println("Loop: " + countPassing(grades1, 75));
        System.out.println("Recursive: " + countPassingRecursive(grades1, 75, 0));

        System.out.println("Test 2:");
        System.out.println("Loop: " + countPassing(grades2, 75));
        System.out.println("Recursive: " + countPassingRecursive(grades2, 75, 0));

        System.out.println("Test 3:");
        System.out.println("Loop: " + countPassing(grades3, 70));
        System.out.println("Recursive: " + countPassingRecursive(grades3, 70, 0));

        System.out.println("Test 4:");
        System.out.println("Loop: " + countPassing(grades4, 75));
        System.out.println("Recursive: " + countPassingRecursive(grades4, 75, 0));
    }
}

    
//Test input	                    Loop	Recursive	Match?
//{60,75,88,74,91}, mark 75	      3	            3	         Yes
//{}, mark 75	                      0	             0	          Yes
//{70,69,80}, mark 70	              2	             2	          Yes
//{90,55,75,100}, mark 75	      3	             3	          Yes



//1. What does each recursive call do to index, and why must it change?
//Each recursive call increases index by 1 to move to the next grade. 
//It must change so the program can check every grade and eventually stop.

//2. What happens if you delete the base case entirely?
//The method would keep calling itself without stopping. Eventually, it would cause a StackOverflowError.

