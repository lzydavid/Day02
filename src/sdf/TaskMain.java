package sdf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TaskMain {
    
    public static void main(String[] args) {
        
        List<Car> garage = new LinkedList<Car>();
        Set<String> names = new HashSet<>();
        Map<String,Integer> debts = new HashMap<>();

        //add car to garage (List can only contain car)
        garage.add(new Car());
        garage.add(new Porche());

        System.out.println(garage);

        //add names to addressbook
        names.add("Fred");
        names.add("Barney");
        names.add("wilma");
        names.add("Fred");

        System.out.println(names);

        //add my debtors
        debts.put("Fred", 10);
        debts.put("David",50);
        debts.put("Fred", 100);

        System.out.println(debts);


    }
}
