package petrolRetailer.model;

import petrolRetailer.model.Card;

public class User {
    String nome;
    String cognome;
    Card userCard;
    Integer fuel=5;
    Integer index;
    boolean hasCustomerFueled=false;

    public User(Integer index,String nome, String cognome, Card userCard, Integer fuelNeed){
        this.nome=nome;
        this.cognome=cognome;
        this.userCard=userCard;
        this.fuel=fuelNeed;
        this.index=index;
    }

    public Integer getFuel() {
        return fuel;
    }

    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }
}
