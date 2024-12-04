/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circletest;
//Joseph Karl V. Boncavil
//december 4, 2024
//constructors
public class circle {
    private double radius;

    // Default constructor
    public circle() {
        this.radius = 1.0;
    }

    // Parameterized constructor
    public circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to calculate diameter
    public double getDiameter() {
        return 2 * radius;
    }
}
