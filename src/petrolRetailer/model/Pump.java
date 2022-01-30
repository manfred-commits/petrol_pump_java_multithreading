package petrolRetailer.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Pump {

    protected final Integer pumpIdentifier;
    protected boolean isPumpAvailable=true;
    protected User customer;

    Pump(Integer pumpIdentifier){

        this.pumpIdentifier=pumpIdentifier;
    }

    //getter
    protected Integer getIdentifier(){

        return pumpIdentifier;
    }
    protected boolean getIsPumpAvailable() {
        return isPumpAvailable;
    }
    public User getCustomer() {
        return customer;
    }


    //setter
    protected void setIsPumpAvailable(boolean newState) {
        isPumpAvailable = newState;
    }

    public void setCustomer(User customer) {
        this.customer = customer;

    }
}
