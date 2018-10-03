package CardDeck;
public class Main {

    public static void main (String [] args) {
        
        // creating 4 different playing cards

        Card card1 = new Card(Suit.CLUBS, 11);
        System.out.println(card1.AlphaConvert());
        
        Card card2 = new Card(Suit.DIAMONDS, 5);
        System.out.println(card2.AlphaConvert());
        
        Card card3 = new Card(Suit.HEARTS, 4);
        System.out.println(card3.AlphaConvert());
        
        Card card4 = new Card(Suit.SPADES, 1);
        System.out.println(card4.AlphaConvert());
        
        
        // calls counter method in Card class, returns a result of 4.
        System.out.println(Card.Counter());

    }


}

