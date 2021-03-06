package petrolRetailer.model;

import petrolRetailer.model.Card;

public class User {
    protected String nome;
    protected String cognome;
    protected Card userCard;
    protected Integer fuel=5;
    protected Integer index;
    protected boolean hasCustomerFueled=false;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
