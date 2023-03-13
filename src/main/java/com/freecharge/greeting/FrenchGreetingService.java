package com.freecharge.greeting;

public class FrenchGreetingService implements GreetingService{
    @Override
    public void greet() {
        System.out.println("Hello in French");
    }
}
