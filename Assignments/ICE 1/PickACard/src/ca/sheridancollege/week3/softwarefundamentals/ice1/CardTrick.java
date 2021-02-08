/**
 * @author Hamza
 * @date Feb 8, 2021
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

//Import statment for getting input
import java.util.Scanner;

public class CardTrick {
    
    //Constant is the predfined amount of cards in magic hand
    final static int MAGICHANDAMOUNT = 7;

    public static void main(String[] args) {
        
        //Object uses default constructor to generate 52 cards which is shuffled 100 times
        Card cards = new Card();
        
        //Creates a deck which is already shuffled and an empty array for magichand
        String[] deck = cards.getDeck();
        String[] magicHand = new String[MAGICHANDAMOUNT];
        
        //Scanner object for input and guessedCard for a message 
        Scanner keyIn = new Scanner(System.in);
        boolean guessedCard = false;
        
        //Gives values for magicHand by picking the cards from the top
        for (int c = 0; c < magicHand.length; c++) {
            magicHand[c] = deck[c];
        }
        
        //Message introducing the game
        System.out.println("Welcome to guess the magic hands!");
        System.out.println("Your goal is to guess what cards are in my hands.");
        
        //Getting number for the card from the user
        System.out.println("\nWhat is the number of the card\n(jack is 10, queen is 11 and king is 12)");
        String userGuess = keyIn.nextLine();
        
        //Getting suites from the user
        System.out.println("\nWhat is the suit of the card\n(Hearts.Diamonds,Spades,Clubs)");
        userGuess = (userGuess + " " + keyIn.nextLine());
        
        //Uses for loop to check wheter the user picked the right card
        for (String currentC : magicHand) {
            if (currentC.equals(userGuess)) {
                System.out.println("Yes one of the cards is " + userGuess);
                guessedCard = true;
                break;
            }
        }
        
        //Message if the user didn't guess the right card
        if (!guessedCard) {
            System.out.println("\nSorry you didn't guess the right card.");
        }
        
        //Prints out the whole magic hand after the user guessed
        System.out.println("\nMagic Hand:");
        for (int c = 0; c < magicHand.length; c++) {
            System.out.println(magicHand[c]);
        }

    }

}
