package petrolRetailer.model;

import com.sun.jdi.connect.AttachingConnector;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Petrol extends Thread{

    //class attributes
    public static int numberOfPumps=4;

    public final ArrayList <Pump> pumpList=new ArrayList<Pump>();

    public User customerFueling;

    ArrayList <ArrayList> pumpUsedByUser=new ArrayList<ArrayList>();

    //constructor
    public Petrol(){
        for(int i=0;i<numberOfPumps;i++){

            final Pump pumpErogator=new Pump(i);

            pumpList.add(pumpErogator);
        }
    }


    @Override
    public void run(){

        //synchronized(pumpList) {
            int availableIndex=0;
            for(int i=0; i<pumpList.toArray().length;i++){

                //System.out.println(i+1+" Pump identifier : "+pumpList.get(i).getIdentifier());
                //System.out.println("fueling");
                if(pumpList.get(i).isPumpAvailable==true){
                    synchronized(pumpList.get(i)) {
                        System.out.println("Pompa disponibile "+(i+1));
                    }


                }

            }

            if(customerFueling.hasCustomerFueled==false){
                pumpUserAssociation();
                //fueling();
            }

        //}

    }
    public void setUsers(User customer){
        customerFueling=customer;
    }
    //method that needs to take the length of the ArrayList containing the customers that need to refuel,
    //cycle through them, and associate them to a free pump instance
    public void pumpUserAssociation(){


            //stores the pump index of a pump that is available
            int pumpIndex=0;



            //cycles through the pumps and breaks when it finds one available
            for(int j=0;j<pumpList.toArray().length;j++){

                //if a pump is available, it sets that pump to false,
                //saves the index in the variable of type int pumpAvailable and break out of the cycle
                if(pumpList.get(j).isPumpAvailable==true){
                    pumpList.get(j).isPumpAvailable=false;
                    pumpIndex=j;
                    break;
                }
            }

            //checks if the user that has been cycled needs to fuel
            if(customerFueling.hasCustomerFueled==false){

                //pumpUsedByUser.add(new ArrayList <Integer> (Arrays.asList(customerFueling.index,pumpList.get(pumpIndex).pumpIdentifier)));
                System.out.println(pumpList.get(pumpIndex).pumpIdentifier);
                fueling(customerFueling,pumpList.get(pumpIndex));
            }


    }


    public void fueling(User customer, Pump pump){
        //for (int i=0;i<pumpUsedByUser.size();i++) {

            //System.out.println(pump.pumpIdentifier);




            System.out.println("Pump identifier : "+(pump.pumpIdentifier+1));

                    for(int k=customer.fuel;k>0;k--){


                            try {

                                System.out.println(k);
                                Petrol.sleep(1000);

                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                    }
            //changes the state of the user that is going to fuel
            customer.hasCustomerFueled=true;

            pumpList.get(pump.pumpIdentifier).setIsPumpAvailable(true);

            //sets the amount of fuel required to 0 after the refill
            customer.fuel=0;
            //System.out.println(pumpUsedByUser);
        //}

    }


}










