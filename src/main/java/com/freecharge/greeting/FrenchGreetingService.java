package com.freecharge.greeting;

import org.springframework.stereotype.Component;

@Component
public class FrenchGreetingService implements GreetingService{
    @Override
    public void greet() {
        System.out.println("Hello in French");
    }
}
