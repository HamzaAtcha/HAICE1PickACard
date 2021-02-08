/**
 * @author Hamza
 * @date Feb 8, 2021
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;


public class CardTrick {
    
    //Constant is the predfined amount of cards in magic hand
    final static int MAGICHANDAMOUNT = 7;

    public static void main(String[] args) {
        
        //Object uses default constructor to generate 52 cards which is shuffled 100 times
        Card cards = new Card();
        
        //Creates a deck which is already shuffled and an empty array for magichand
        String[] deck = cards.getDeck();
        String[] magicHand = new String[MAGICHANDAMOUNT];
        
        boolean guessedCard = false;
        
        //Gives values for magicHand by picking the cards from the top
        for (int c = 0; c < magicHand.length; c++) {
            magicHand[c] = deck[c];
        }
        
        //Message introducing the game
        System.out.println("Welcome to guess the magic hands!");
        System.out.println("Your goal is to guess what cards are in my hands.");
        
        String luckyCard = ("10 Spades");
        
        //Uses for loop to check wheter the user picked the right card
        for (String currentC : magicHand) {
            if (currentC.equals(luckyCard)) {
                System.out.println("Yes one of the cards is " + luckyCard);
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
