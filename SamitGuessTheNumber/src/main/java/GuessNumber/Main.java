/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GuessNumber;

/**
 *
 * @author IIT DU
 */
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Run the game
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GuessTheNumberGUI();
            }
        });
    }
}

