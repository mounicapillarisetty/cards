/**
 * A Card is a playing card from an Anglo-American deck of cards.
 * 
 * @author Mounica Pillarisetty
 * @version October 23, 2017
 */
public class Card
{
    /** The card's suit: "hearts", "diamonds", "clubs", "spades". */
    private String suit;
    
    /** 
     * The card's rank, between 1 and 13 (1 represents the ace, 11 represents
     * the jack, 12 represents the queen, and 13 represents the king.)
     */
    private int rank;
    
    /**
     * Constructs a new card with the specified suit and rank.
     */
    public Card(String suit, int rank)
    {
        this.rank = rank;
        this.suit = suit;
    }
    
    /**
     * Returns this card's suit.
     * @return suit   a string variable that holds the suit of the card
     */
    public String suit()
    {
        return suit;
    }
    
    /**
     * Returns this card's rank.
     * @return rank   a string variable that holds the rank of the card
     */
    public int rank()
    {
        return rank;
    }
    
    /**
     * Determines if this card has the same rank as the specified card.
     * @return true   if same rank as parameter 
     * @param aCard   the given Card
     */
    public boolean hasSameRank(Card aCard)
    {
        return (aCard.rank() == rank());
    }
    
    /**
     * Determines if this card is equal to the specified card.
     * @return true   if the card parameter is equal to card
     * @param aCard   the given Card
     */
    public boolean isEqualTo(Card aCard)
    {
        return (aCard.rank() == rank() && aCard.suit().equals(suit()));
        
    }
}
