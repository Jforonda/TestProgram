/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testprogram;

import java.util.Scanner;

/**
 *
 * @author James
 */
public class TestProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        double area;
        
        System.out.println("Radius: ");
        radius = input.nextDouble();
        area= radius*3.14;
        
        System.out.println("The area of the circle of radius " + radius + " is "
                + area);
    }
}
