public class Card {
    private String suit;
    private int value;

    public Card(String suit, int value) {
        this.suit = suit;
        if (value > 13 || value < 1 ) {
            throw new IllegalArgumentException("Value must be within 1 and 13 ");
        } else {
            this.value = value;
        }
    }

    public String getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public void beats (Card cardToBeat) {
        String currentCardSuit = getSuit();
        int currentCardValue = getValue();
        String cardToBeatSuit = cardToBeat.getSuit();
        if (checkSuit(currentCardSuit,cardToBeatSuit)) {
            if (currentCardValue == cardToBeat.getValue()) {
            System.out.println("Both cards have the same value, noone wins");
            }
            if (currentCardValue < cardToBeat.getValue()) {
            System.out.println("Your card has a lower value than your opponent");
            }
            if (currentCardValue > cardToBeat.getValue()) {
            System.out.println("Your card has a higher value than your opponent");
            }
        } else {
            System.out.println("Your card does not beat ");
        }
    }
    public boolean checkSuit (String currentCardSuit, String cardToBeatSuit) {
        if (currentCardSuit == cardToBeatSuit) {
            return true;
        }
        if (currentCardSuit == "hearts" && cardToBeatSuit == "diamonds") {
            return true;
        }
        if (currentCardSuit == "diamonds" && cardToBeatSuit == "spades") {
            return true;
        }
        if (currentCardSuit == "spades" && cardToBeatSuit == "clubs") {
            return true;
        }
        if (currentCardSuit == "spades" && cardToBeatSuit == "hearts") {
            return true;
        }
        else return false;

    }
}
