package com.freecharge;

import com.freecharge.greeting.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyApp {
    @Autowired
            @Qualifier("Angrezi")
    GreetingService gre;

    void greet_me() {
        gre.greet();
    }
}
