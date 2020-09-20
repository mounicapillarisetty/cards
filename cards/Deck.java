import java.util.ArrayList;
import java.util.Random;

/**
 * Deck models a deck of 52 Anglo-American playing cards.
 * 
 * @author Mounica Pillarisetty
 * @version October 23, 2017
 *
 */
public class Deck
{
    /** 
     * The cards are stored in a linked-list implementation of the
     * List collection.
     */
    private ArrayList<Card> cards;
    
    /** Lowest ranking card (the ace). */
    private static final int ACE = 1;
    
    /** Highest ranking card (the king). */
    private static final int KING = 13;
    
    /** 
     * Total number cards in the deck (4 suits, each with 13 cards of 
     * different ranks).
     */ 
    private static final int TOTAL_CARDS = 52;
    
    /** 
     * Some constants that define the Strings for the various suits.
     */ 
    private static final String HEARTS = "hearts";
    private static final String DIAMONDS = "diamonds";
    private static final String CLUBS = "clubs";
    private static final String SPADES = "spades";

    /**
     * Constructs a new, unshuffled deck containing 52 playing cards.
     */
    public Deck()
    {            
        cards = new ArrayList<Card>(TOTAL_CARDS);
        buildSuit(HEARTS);
        buildSuit(DIAMONDS);
        buildSuit(CLUBS);
        buildSuit(SPADES);
    }
    
    /**
     * Creates the 13 cards for the specified suit, and adds them
     * to this deck.
     */
    private void buildSuit(String suit)
    {
        for (int i = ACE; i <= KING; i++){
            if(suit==HEARTS||suit==DIAMONDS||suit==CLUBS||suit==SPADES){
                cards.add(new Card(suit,i)); 
            }
            else{
                return;
            }
        }
    }
 
    /**
     * Shuffles this deck of cards.
     */
    public void shuffle()
    {  
        Random r = new Random ();
        Card card1;
        Card card2;
        int l;
        int m;
        //j++;
        for (int i = 0; i < 10000; i++){
            l = r.nextInt(TOTAL_CARDS);
            m = r.nextInt(TOTAL_CARDS);
            card1 = cards.get(l);
            card2 = cards.get(m);
            cards.set(m,card1);
            cards.set(l,card2);
        }
        return;
    }
 
    /**
     * Removes a card from this deck.
     */
    public Card dealCard()
    {
        return cards.remove(0);
    }
 
    /**
     * Determines if this deck is empty.
     */
    public boolean isEmpty()
    {
        return (cards.size() == 0);
    }
  
    /**
     * Returns the number of cards that are currently in the deck.
     */
    public int size()
    {
        return cards.size();
    }
}
