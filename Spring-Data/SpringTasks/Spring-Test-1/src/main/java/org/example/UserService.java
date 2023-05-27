package org.example;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    //1. Atribute//

    NotificationService notificationService;

    //2. Constructor//


    public UserService(NotificationService notificationService) {
        System.out.println("Ejecutando constructor de UserService");
        this.notificationService = notificationService;
    }


}

