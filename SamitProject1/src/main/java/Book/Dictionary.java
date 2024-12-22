/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;

/**
 *
 * @author iit
 */
public class Dictionary extends Book{

    protected int definitions;

    Dictionary(int numPages, int numDefinitions) {
        super(numPages);  // Calls the constructor of the parent class (Book)
        definitions = numDefinitions;
    }
    
     // Method to display the number of definitions
    public void displayDefinitions() {
        System.out.println("Number of definitions: " + definitions);
        System.out.println("Definitions per page: " + (definitions/pages));
        super.displayPages();

    }
}

