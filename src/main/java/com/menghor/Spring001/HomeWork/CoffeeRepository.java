package com.menghor.Spring001.HomeWork;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class CoffeeRepository {
    private final static ArrayList<Coffee> coffees = new ArrayList<>()
    {{
       add(new Coffee("001","Ice Latte", 7500.0, true));
       add(new Coffee("002","Cappuccino", 5000.0, true));
       add(new Coffee("003","Espresso", 3000.0, true));
       add(new Coffee("004","Americano", 4000.0, false));
       add(new Coffee("005","Latte", 6000.0, true));
    }};
    public ArrayList<Coffee> getCoffees() {
        return coffees;
    }
}
