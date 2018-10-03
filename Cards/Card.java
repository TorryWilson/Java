public class Card {

    private Suit kind;
    private int number;

    private static int count;

    public Card(Suit kind, int number) {

        this.kind = kind;
        this.number = number;
        count++;

    }

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

        public static int Counter(){

        return count;
        }


    }




