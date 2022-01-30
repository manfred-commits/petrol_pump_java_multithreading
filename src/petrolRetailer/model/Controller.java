package petrolRetailer.model;

import java.util.ArrayList;

public class Controller {

    //attributes
    protected ArrayList<Pump> pumpList=new ArrayList<Pump>();

    protected static int numberOfPumps=4;

    //constructor
    public Controller (){

        for(int i=0;i<numberOfPumps;i++){

            Pump pumpErogator=new Pump(i);

            pumpList.add(pumpErogator);
        }

    }

    public ArrayList<Pump> getPumpList() {
        return pumpList;
    }

    public void setPumpList(ArrayList<Pump> pumpList) {
        this.pumpList = pumpList;
    }
}
