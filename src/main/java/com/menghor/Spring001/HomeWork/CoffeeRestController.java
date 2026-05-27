package com.menghor.Spring001.HomeWork;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/coffees")
public class CoffeeRestController {
    private final CoffeeRepository coffeeRepository;

    public CoffeeRestController(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    @GetMapping("")
    public Map<String, Object> getCoffees(){
        Map<String, Object> coffee = new HashMap<>();
        coffee.put("coffees", coffeeRepository.getAllCoffees());
        coffee.put("message", "success");
        return coffee;
    }
}
