
/**
 * @author Hamza
 * @date Feb 8, 2021
 */


package ca.sheridancollege.week3.softwarefundamentals.ice1;

//This class has methods which generate and shuffle cards
public class Card {
    
    //This variable holds the value for the whole deck
    private String[] deck = new String[52];
    
    //The constants holds the values for suits and number
    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    public static final int MAXNUMBER = 13;
    
    //This variable etermines how many pairs of cards will be shuffled
    public static int amountShuffle;
    
    //Default constructor which has amountShuffle as 100
    public Card (){
        this(100);
    }
    
    //This constructor will call method which create and shuffle method
    public Card (int amountShuffle){
        this.amountShuffle = amountShuffle;
        createDeck();
        shuffleDeck();
    }
    
    //Returns string array for deck. There is no set as deck is created in this class
    public String[] getDeck() {
        return this.deck;
    }
    
    //Creates a deck of 52 card in order by using 2 for loops 
    public void createDeck() {
        int c = 0;
        for (int s = 0; s < SUITS.length; s++) {
            for (int n = 1; n <= MAXNUMBER; n++) {
                deck[c] = (n + " " + SUITS[s]);
                c++;
            }
        }
    }
    
    //This method will randomize cards by swapping the postion of 2 random postions
    public void shuffleDeck(){
        String temp;
        int randomP1,randomP2;
        for  (int c = 0; c < amountShuffle; c++){
            randomP1 = (int)(Math.random()*52);
            randomP2 = (int)(Math.random()*52);
            temp = deck[randomP1];
            deck[randomP1] = deck[randomP2];
            deck[randomP2] = temp;
        }
    }
}
