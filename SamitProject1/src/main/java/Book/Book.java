/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;

/**
 *
 * @author iit
 */
public class Book {

    protected int pages;

    public Book(int numPages) {
        pages = numPages;
    }
    
    // Method to display the number of pages
    public void displayPages() {
        System.out.println("Number of pages: " + pages);
    }
}

