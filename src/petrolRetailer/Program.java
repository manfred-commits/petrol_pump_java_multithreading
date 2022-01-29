package petrolRetailer;

import petrolRetailer.model.Card;
import petrolRetailer.model.Petrol;
import petrolRetailer.model.Pump;
import petrolRetailer.model.User;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        //initialization of class instance of type Petrol
        Petrol pumpController=new Petrol();
        Petrol pumpController2=new Petrol();

        pumpController.start();

        //ArrayList containing the customers that need to re fuel
        ArrayList <User> customerList=new ArrayList<User> (Arrays.asList(
                new User(0,"Marchio","Rossi", new Card("4242 4242 4242 4242","10/22"),20),
                new User(1,"Martino","Bianchi", new Card("4242 4242 4242 4242","10/22"),16),
                new User(2,"Marileno","Gialli",new Card("4242 4242 4242 4242","10/22"),18),
                new User(3,"Mario","Verdi", new Card("4242 4242 4242 4242","10/22"),9))
        );
        //System.out.println(customerList.size());
        //pumpController.start();
        synchronized (pumpController) {
            for (int i = 0; i < customerList.size(); i++) {
                //passage of ArrayList of type User containing all the customers
                pumpController.setUsers(customerList.get(i));
                //System.out.println(customerList.get(i).getFuel());
                //initialization of thread
                pumpController.start();
            }
        }
//            pumpController2.setUsers(customerList.get(0));
//            //System.out.println(customerList.get(i).getFuel());
//            //initialization of thread
//            pumpController2.start();
//
//
//            pumpController.setUsers(customerList.get(1));
//            //System.out.println(customerList.get(i).getFuel());
//            //initialization of thread
//            pumpController.start();
//        }



        //pumpController.fueling();
    }
}
