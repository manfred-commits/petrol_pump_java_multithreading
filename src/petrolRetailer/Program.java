package petrolRetailer;

import petrolRetailer.model.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {



        Controller pumpControl= new Controller();

        //ArrayList containing the customers that need to re fuel
        ArrayList <User> customerList=new ArrayList<User> (Arrays.asList(
                new User(0,"Marchio","Rossi", new Card("4242 4242 4242 4242","10/22"),20),
                new User(1,"Martino","Bianchi", new Card("4242 4242 4242 4242","10/22"),16),
                new User(2,"Marileno","Gialli",new Card("4242 4242 4242 4242","10/22"),18),
                new User(3,"Mario","Verdi", new Card("4242 4242 4242 4242","10/22"),9))
        );
        //System.out.println(customerList.size());
        //pumpController.start();



        for (int i = 0; i < customerList.size(); i++) {
            //initialization of class instance of type Petrol
            Petrol pumpController=new Petrol(pumpControl.getPumpList());
            //initialization of thread
            pumpController.start();
            //passage of ArrayList of type User containing all the customers
            pumpController.setUsers(customerList.get(i));
            System.out.println(customerList.get(i).getNome());

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
