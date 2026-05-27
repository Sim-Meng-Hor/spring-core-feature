package com.menghor.Spring001.HomeWork;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.util.pattern.PathPattern;

import java.security.PrivateKey;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Coffee {
    private String code;
    private String name;
    private double price;
    private Boolean isAvailable;
}
