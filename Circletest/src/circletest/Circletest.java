/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circletest;

import java.util.Scanner;
import javax.swing.JOptionPane;

//Joseph Karl V. Boncavil
//december 4, 2024
//main code

public class Circletest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Default and custom radius circles
        circle defaultCircle = new circle();
        System.out.println("Default Circle:");
        displayCircleInfo(defaultCircle);

        System.out.print("Enter a custom radius: ");
        double customRadius = scanner.nextDouble();
        circle customCircle = new circle(customRadius);
        System.out.println("Custom Circle:");
        displayCircleInfo(customCircle);

        // Calculate area and circumference for a set of radii
        double[] radii = {1.0, 2.5, 4.0, 7.5};
        System.out.println("Calculations for multiple radii:");
        for (double radius : radii) {
            circle circle = new circle(radius);
            displayCircleInfo(circle);
        }

        scanner.close();
    }

    // Method to display circle information
    public static void displayCircleInfo(circle circle) {
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
        System.out.println("Diameter: " + circle.getDiameter());
        System.out.println();
    }
}