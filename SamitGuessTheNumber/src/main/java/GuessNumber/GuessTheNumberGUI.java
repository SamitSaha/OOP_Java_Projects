/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GuessNumber;
/**
 *
 * @author IIT DU
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessTheNumberGUI {
    private JFrame frame;
    private JTextField guessInput;
    private JButton guessButton;
    private JLabel messageLabel;
    private JLabel attemptsLabel;
    private GuessTheNumberGame game;
    
    // To setup the GUI Component
    public GuessTheNumberGUI(){
        game = new GuessTheNumberGame();
        frame = new JFrame("Guess THe Number Guess");
        
        // Set background color
        frame.getContentPane().setBackground(new Color(240, 240, 240)); // Light Gray Background
        
        // Set window icon (Logo) - You can replace the file path with your own image file path
        ImageIcon icon = new ImageIcon("path/to/your/logo.png"); // Replace with your image path
        frame.setIconImage(icon.getImage());
        
        //layout manager -  using FlowLayout with padding and alignment
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        
        // Component
        JLabel promptLabel = new JLabel("Guess a number between 1 and 100:");
        promptLabel.setFont(new Font("Arial", Font.BOLD, 14));
        
        guessInput = new JTextField(5);
        guessInput.setFont(new Font("Arial", Font.PLAIN, 16));
        guessInput.setBackground(Color.WHITE);
        guessInput.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        
        guessButton = new JButton("Guess");
        guessButton.setFont(new Font("Arial", Font.PLAIN, 16));
        guessButton.setBackground(new Color(0, 153, 255)); // Blue color for the button
        guessButton.setForeground(Color.WHITE);
        guessButton.setFocusPainted(false); // Removes the focus border
        
        messageLabel = new JLabel("Start Guessing!");
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        messageLabel.setForeground(new Color(255, 0, 0)); // Red color for messages
        
        attemptsLabel = new JLabel("Attempts: 0");
        attemptsLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        attemptsLabel.setForeground(new Color(0, 0, 0)); // Black color for attempts
        
        // Adding components to frame
        frame.add(promptLabel);
        frame.add(guessInput);
        frame.add(guessButton);
        frame.add(messageLabel);
        frame.add(attemptsLabel);
        
        // Button Listener 
        guessButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    int guess = Integer.parseInt(guessInput.getText() );
                    String result = game.checkGuess(guess);
                    messageLabel.setText(result);
                    attemptsLabel.setText("Attempts: " + game.getAttempts());
                    
                    // if guessed correctly reset the game.
                    if(result.startsWith("Correct")){
                        int response = JOptionPane.showConfirmDialog(frame, "You won! Play Again?",
                                "Game Over", JOptionPane.YES_NO_OPTION);
                        if(response == JOptionPane.YES_OPTION){
                            game.resetGame();
                            messageLabel.setText("Start Guessing!");
                            attemptsLabel.setText("Attempts: 0");
                            guessInput.setText("");
                        }
                    }
                    
                } catch(NumberFormatException ex){
                    messageLabel.setText("Please enter a valid number.");
                }
            }
        });
        // Window settings
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center window
        frame.setVisible(true);
    }
}
