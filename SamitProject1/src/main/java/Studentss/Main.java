/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Studentss;

/**
 *
 * @author iit
 */
public class Main {
    public static void main(String[] args) {
        Student s1, s2;
        s1 = new Undergraduate(); // polymorphic assignment
        s2 = new Graduate(); // polymorphic assignment

        Graduate s3 = s2; // is this OK?
        
        Graduate s3 = (Graduate) s2; // explicit casting

    }
}
