package com.freecharge.greeting;

import org.springframework.stereotype.Component;

@Component
public class EnglishGreetingService implements GreetingService{
    @Override
    public void greet() {
        System.out.println("Hello in English !");
    }
}


