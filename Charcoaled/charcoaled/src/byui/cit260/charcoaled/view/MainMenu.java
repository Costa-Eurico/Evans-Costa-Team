/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.charcoaled.view;

import byui.cit260.charcoaled.control.GameControl;
import charcoaled.Charcoaled;
import java.util.Scanner;

/**
 *
 * @author ih8pcs
 */
public class MainMenu {

    private final String MENU = "\n"
            + "\n*************************************"
            + "\n | Main Menu                        |"
            + "\n*************************************"
            + "\n N - New Game"
            + "\n G - Saved Game"
            + "\n H - Help Menu"
            + "\n S - Save Game"
            + "\n E - Exit Game";
            
    
    public void displayMenu() {
        
        char selection = ' ';
        do {
            
            System.out.println(MENU); //display main menu
            
            String input = this.getInput(); //get the user's selection
            selection = input.charAt(0); //get first character of string
            
            this.doAction(selection); //do action based on selection
        } while (selection != 'E'); // a selection is not "Exit"
    }

    private String getInput() {
        boolean valid = false; //indicates if name has been retrieved
        String playerInput = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while (!valid) { //while valid name has not been retrieved
            
            //prompt for player's name
            System.out.println("Enter choice from Main Menu:");
            
            //get the name from the keyboard and trim off blanks
            playerInput = keyboard.nextLine();
            playerInput = playerInput.trim();
            
            //if the name is invalid (< 1 characters)
            if (playerInput.length() < 1) {
                System.out.println("Invalid request - please enter one of Main Menu Options");
                continue; //and repeat again
            }
            break; // out of the repetition
        }
        
        return playerInput; //return name
    }

    private void doAction(char choice) {
        
        switch (choice) {
            case 'N': //create and start new game
                this.startNewGame();
                break;
            case 'n': //create and start new game
                this.startNewGame();
                break;
            case 'G': //get and start an existing game
                this.startExistingGame();
                break;
            case 'g': //get and start an existing game
                this.startExistingGame();
                break;
            case 'H': //display help menu
                this.displayHelpMenu();
                break;
            case 'h': //display help menu
                this.displayHelpMenu();
                break;
            case 'S': //save current game
                this.saveGame();
                break;
            case 's': //save current game
                this.saveGame();
                break;
            case 'E': //exit the program
                return;
            default:
                System.out.println("\n*** Invalid selection, please try again. ***");
                break;
        }
    }

    private void startNewGame() {
        //create new game
        GameControl.createNewGame(Charcoaled.getPlayer());
        
        GameMenu gameMenu;
        gameMenu = new GameMenu();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
         System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

}

   
    

