/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package itfp2249.assessment4;
import java.util.Scanner;
/**
 *
 * @author jmazzie
 */
public class Assessment4 {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        
        System.out.print("Teacher's Copy");
        System.out.print("\nEnter a course code to validate (e.g. IT4782): ");
        String courseCode = enter.nextLine().toUpperCase();
        
        if (courseCode.matches("IT4782"))
        {
            System.out.print("Course code: " + courseCode + " is valid");
        }
        if (courseCode.charAt(0) !='I')
        {
            System.out.print("\nFirst character is not an I or an i");            
        }
        if (courseCode.charAt(1) !='T')
        {
            System.out.print("\nSecond character is not an T or an t");            
        }
        if (!Character.isDigit(courseCode.charAt(2)))
        {
            System.out.print("\nThird character is not a digit");            
        }
        if (!Character.isDigit(courseCode.charAt(3)))
        {
            System.out.print("\nForth character is not a digit");            
        }
        if (!Character.isDigit(courseCode.charAt(4)))
        {
            System.out.print("\nFifth character is not a digit");            
        }
        if (!Character.isDigit(courseCode.charAt(5)))
        {
            System.out.print("\nSixth character is not a digit");            
        }
    }
}
