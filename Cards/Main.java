public class Main {

    public static void main (String [] args) {

        Card card1 = new Card(Suit.CLUBS, 11);
        System.out.println(card1.AlphaConvert());
        Card card2 = new Card(Suit.DIAMONDS, 5);
        System.out.println(card2.AlphaConvert());

        System.out.println(Card.Counter());

    }


}

