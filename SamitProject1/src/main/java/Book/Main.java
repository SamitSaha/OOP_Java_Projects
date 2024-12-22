/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;

/**
 *
 * @author iit
 */
public class Main {
    public static void main(String[] args) {
        // Create a Dictionary object
        Dictionary myDictionary = new Dictionary(500, 1000);

        // Call methods from both Dictionary and Book classes
        myDictionary.displayPages();  // From the Book class
        myDictionary.displayDefinitions();  // From the Dictionary class
    }
}
