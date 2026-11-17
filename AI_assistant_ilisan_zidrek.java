/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ai_assistant_ilisan_zidrek;

/**
 *
 * @author LENOVO LOQ
 */
public class AI_assistant_ilisan_zidrek {
    
    
    
    
    
1. Inputs :int total (sum of values) and int count (number of values).
2. Output :double — returns the average calculated by dividing total by count.
3. Special case :If count <= 0, return 0.0 to avoid division by zero or an invalid count.

   


    public static double computeAverage(int total, int count) {
        if (count <= 0) {
            return 0.0;
        }

        return (double) total / count;
    }

    public static void main(String[] args) {
        System.out.println(computeAverage(5, 2));
        System.out.println(computeAverage(10, 0));
        System.out.println(computeAverage(100, 8));
        System.out.println(computeAverage(20, 4));
    }
}


Test	Expected	Your result	Pass?
computeAverage(5, 2)	2.5	2.5	Yes
computeAverage(10, 0)	0.0	0.0	Yes
computeAverage(100, 8)	12.5	12.5	Yes
computeAverage(20, 4)	5.0	5.0	Yes


1. Why does the method need the word double (or a cast) in the return?
Because double allows the method to return decimal values. Casting total 
to double prevents integer division from removing the decimal part.

2. What would go wrong without the count <= 0 guard?
If count is zero, the program would throw an ArithmeticException because it
attempts integer division by zero. The guard also handles negative counts by returning 0.0.
