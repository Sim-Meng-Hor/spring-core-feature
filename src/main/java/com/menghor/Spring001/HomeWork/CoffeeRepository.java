package com.menghor.Spring001.HomeWork;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Configuration
public class CoffeeRepository {
    private final static ArrayList<Coffee> coffees = new ArrayList<>();
    @Bean
    public Coffee espresso() {
        return new Coffee("C001", "Espresso", 2.50, true);
    }

    @Bean
    public Coffee latte() {
        return new Coffee("C002", "Latte", 3.50, true);
    }

    @Bean
    public Coffee cappuccino() {
        return new Coffee("C003", "Cappuccino", 4.00, false);
    }


    public ArrayList<Coffee> getAllCoffees() {
        ArrayList<Coffee> coffees = new ArrayList<>();
        coffees.add(espresso());
        coffees.add(latte());
        coffees.add(cappuccino());
        return coffees;
    }
}
