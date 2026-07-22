package Collections.Project3;

public class Card implements Comparable<Card> {

    private String symbol;
    private int number;

    public Card(String symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object obj) {
        Card c = (Card) obj;
        return this.symbol.equals(c.symbol);
    }

    @Override
    public int hashCode() {
        return symbol.hashCode();
    }

    @Override
    public int compareTo(Card c) {
        return this.symbol.compareTo(c.symbol);
    }
}
