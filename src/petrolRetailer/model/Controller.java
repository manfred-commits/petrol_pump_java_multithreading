package petrolRetailer.model;

import java.util.ArrayList;

public class Controller {
    public ArrayList<Pump> pumpList=new ArrayList<Pump>();

    public static int numberOfPumps=4;

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
