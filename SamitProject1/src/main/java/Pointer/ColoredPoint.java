/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pointer;

import java.awt.Color;

// ColoredPoint class extends Point
public class ColoredPoint extends Point {  
    private Color color; 

    // Constructor with x, y, and color
    public ColoredPoint(int x, int y, Color color) {
        super(x, y);  // Call the parent (Point) constructor
        this.color = color;
    }

    // Constructor with x and y, default color
    public ColoredPoint(int x, int y) { 
        this(x, y, Color.BLACK); // Call another constructor in this class
    } 

    // Default constructor
    public ColoredPoint() {  
        super();  // Call the default constructor of Point (x=0, y=0)
        color = Color.BLACK;
    }

    // Getter for color
    public Color getColor() {
        return color;
    }
}