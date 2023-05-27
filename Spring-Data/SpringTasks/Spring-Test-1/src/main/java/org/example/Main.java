package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Greeting greeting = (Greeting) context.getBean("printGreeting");

        String text = greeting.helloWorld();
        System.out.println(text);
    }
}