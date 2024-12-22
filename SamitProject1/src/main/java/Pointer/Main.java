/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pointer;

import java.awt.Color;

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an instance of Point
        Point point = new Point(3, 4);
        
        // Create an instance of ColoredPoint with specific color
        ColoredPoint coloredPoint1 = new ColoredPoint(5, 6, Color.RED);
        
        // Create an instance of ColoredPoint with default color
        ColoredPoint coloredPoint2 = new ColoredPoint(7, 8);

        // Create an instance of ColoredPoint with default values
        ColoredPoint coloredPoint3 = new ColoredPoint();

        // Print the values of the Point
        System.out.println("Point coordinates: x = " + point.getX() + ", y = " + point.getY());

        // Print the values of the first ColoredPoint
        System.out.println("ColoredPoint 1 coordinates: x = " + coloredPoint1.getX() + ", y = " + coloredPoint1.getY() + ", color = " + coloredPoint1.getColor());

        // Print the values of the second ColoredPoint (default color)
        System.out.println("ColoredPoint 2 coordinates: x = " + coloredPoint2.getX() + ", y = " + coloredPoint2.getY() + ", color = " + coloredPoint2.getColor());

        // Print the values of the third ColoredPoint (default x, y, and color)
        System.out.println("ColoredPoint 3 coordinates: x = " + coloredPoint3.getX() + ", y = " + coloredPoint3.getY() + ", color = " + coloredPoint3.getColor());
    }
}