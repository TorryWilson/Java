package CardDeck;

public class Card {
    // fields of a Card
    private Suit kind;
    private int number;

    // counter variable that belongs to entire class, reason why its static.
    private static int count;

    // Card constructor
    public Card(Suit kind, int number) {

        this.kind = kind;
        this.number = number;
        
        // increases count of card
        count++;

    }

    // method to convert number to String and also allows the # 11, 12, 13 to be Jack, Queen, King
    public String AlphaConvert() {

            String numberString;
            switch (number) {

                case 11:
                    numberString = "Jack";
                    break;
                case 12:
                    numberString = "Queen";
                    break;

                case 13:
                    numberString = "King";
                    break;
                default:
                    numberString = Integer.toString(number);
                    break;
            }

            return numberString + " of " + kind;

        }
    // getters and setters
        public Suit getKind() {
            return kind;
        }

        public void setKind(Suit kind) {
            this.kind = kind;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

    
    // returns the total count of cards.
        public static int Counter(){

        return count;
        }


    }




