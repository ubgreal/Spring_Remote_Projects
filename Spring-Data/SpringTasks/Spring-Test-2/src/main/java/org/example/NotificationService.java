package org.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public NotificationService() {
        System.out.println("Ejecutando constructor NotificationService");
    }

    public String printGreeting(){
        return "Hello";
    }
}

