/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GuessNumber;
/**
 *
 * @author IIT DU
 */

import java.util.Random;

public class GuessTheNumberGame {
    private int targetNumber;
    private int attempts;
    
    // construct to initialize the game 
    public GuessTheNumberGame(){
        resetGame();
    }
    // Method to reset the game
    public void resetGame(){
        Random rand = new Random();
        targetNumber = rand.nextInt(100)+1;
        attempts = 0;
    }
    // Method to check the players guess
    public String checkGuess(int guess){
        attempts++;
        if(guess < targetNumber)
            return "Too Low!";
        else if(guess > targetNumber)
            return "Too Hight!";
        else
            return "Correct your given number in" + attempts + " attempts!";
    }
    public int getAttempts(){
        return attempts;
    }
}
