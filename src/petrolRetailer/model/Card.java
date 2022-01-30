package petrolRetailer.model;

public class Card {
    protected String cardNumber;
    protected String expirationDate;

    public Card(String cardNumber, String expirationDate){
        this.cardNumber=cardNumber;
        this.expirationDate=expirationDate;
    }
}
